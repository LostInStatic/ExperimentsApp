package pl.czarczeslaw.experimentsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pl.czarczeslaw.experimentsapp.mapper.ProductMapper;
import pl.czarczeslaw.experimentsapp.mapper.TrialMapper;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;
import pl.czarczeslaw.experimentsapp.model.dto.UpdateTrialDto;
import pl.czarczeslaw.experimentsapp.repository.ProductRepository;
import pl.czarczeslaw.experimentsapp.repository.TrialReposiotory;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class TrialService {
    private final TrialReposiotory trialReposiotory;
    private final TrialMapper trialMapper;
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @Autowired
    public TrialService(TrialReposiotory trialReposiotory, TrialMapper trialMapper, ProductMapper productMapper, ProductRepository productRepository) {
        this.trialReposiotory = trialReposiotory;
        this.trialMapper = trialMapper;
        this.productMapper = productMapper;
        this.productRepository = productRepository;
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

    public Page<Trial> getPage(PageRequest of) {
        return trialReposiotory.findAll(of);
    }
}
