package pl.czarczeslaw.experimentsapp.service;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import pl.czarczeslaw.experimentsapp.mapper.ImageMapper;
import pl.czarczeslaw.experimentsapp.mapper.TrialMapper;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.TrialPhoto;
import pl.czarczeslaw.experimentsapp.model.dto.AddNewImageDto;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;
import pl.czarczeslaw.experimentsapp.model.dto.UpdateTrialDto;
import pl.czarczeslaw.experimentsapp.repository.TrialPhotoRepository;
import pl.czarczeslaw.experimentsapp.repository.TrialReposiotory;
import springfox.documentation.spring.web.json.Json;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TrialService {
    private final TrialReposiotory trialReposiotory;
    private final TrialMapper trialMapper;
    private final TrialPhotoRepository trialPhotoRepository;
    private final ImageMapper imageMapper;

    @Autowired
    public TrialService(TrialReposiotory trialReposiotory, TrialMapper trialMapper, TrialPhotoRepository trialPhotoRepository, ImageMapper imageMapper) {
        this.trialReposiotory = trialReposiotory;
        this.trialMapper = trialMapper;
        this.trialPhotoRepository = trialPhotoRepository;
        this.imageMapper = imageMapper;
    }

    public List<Trial> getAll() {
        return trialReposiotory.findAll();
    }

    public Trial getById(Long trailId) {
        Optional<Trial> studentOptional = trialReposiotory.findById(trailId);
        if (studentOptional.isPresent()) {
            return studentOptional.get();
        }
        throw new EntityNotFoundException("trial, id:" + trailId);
    }

    public Long save(CreateTrialDto dto) {
        Trial trial = trialMapper.createTrialFromDto(dto);
        return trialReposiotory.save(trial).getId();
    }

    public Trial update(UpdateTrialDto dto) {
        Optional<Trial> optional = trialReposiotory.findById(dto.getTrialId());
        if (optional.isPresent()) {
            Trial trial = optional.get();

            if (dto.getName() != null) {
                trial.setName(dto.getName());
            }
            if (dto.getDescription() != null) {
                trial.setDescription(dto.getDescription());
            }

            return trialReposiotory.save(trial);
        } else {
            throw new EntityNotFoundException("trial, id:" + dto.getTrialId());
        }
    }

    public void delete(Long id) {
        if (trialReposiotory.existsById(id)) {
            trialReposiotory.deleteById(id);
            return;
        }
        throw new EntityNotFoundException("trial, id:" + id);
    }

    public void savePhotoFor(Long trialId, MultipartFile image) throws IOException {
        Optional<Trial> optional = trialReposiotory.findById(trialId);
        if (optional.isPresent() && !image.isEmpty()) {
            Trial trial = optional.get();
            TrialPhoto trialPhoto = imageMapper.mapImageFromDto(new AddNewImageDto(null, image.getOriginalFilename(), image.getBytes()));
            trialPhotoRepository.save(trialPhoto);

            trial.setPhoto(trialPhoto);
            trialReposiotory.save(trial);
        } else if (optional.isEmpty()) {
            throw new EntityNotFoundException("Not found:" + trialId);
        } else {
            throw new IOException("no image");
        }
    }

    public byte[] getImageById(Long id) {
        Optional<TrialPhoto> optional = trialPhotoRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get().getFoto();
        } else {
            throw new EntityNotFoundException("not found photo with id:" + id);
        }
    }

    public JSONObject getDescById(Long id) {
        Optional<Trial> optional = trialReposiotory.findById(id);
        if (optional.isPresent()) {
            JSONObject object = new JSONObject();
            Map<String, String> map = new HashMap<>();
            map.put("id", String.valueOf(optional.get().getId()));
            map.put("description", optional.get().getDescription());
            object.putAll(map);
            return object;
        } else {
            throw new EntityNotFoundException("nope");
        }
    }
}
