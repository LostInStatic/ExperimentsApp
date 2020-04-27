package pl.czarczeslaw.experimentsapp.controller;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;
import pl.czarczeslaw.experimentsapp.model.dto.UpdateTrialDto;
import pl.czarczeslaw.experimentsapp.service.TrialService;

import javax.validation.constraints.Min;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path = "/trial")
@Validated
public class TrialController {
    private final TrialService trialService;

    @Autowired
    public TrialController(TrialService trialService) {
        this.trialService = trialService;
    }

    @GetMapping("/get")
    public List<Trial> getAll() {
        return trialService.getAll();
    }

    @GetMapping("/get/{id}")
    public Trial getById(@PathVariable("id") @Min(1) Long id) {
        return trialService.getById(id);
    }

    @GetMapping("/get/descr/{id}")
    public JSONObject getDescriptionById(@PathVariable("id") @Min(1) Long id) {
        return trialService.getDescById(id);
    }

    @GetMapping("/get/image/{id}")
    public byte[] getImageById(@PathVariable("id") @Min(1) Long id) {
        return trialService.getImageById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createTrial(@RequestBody CreateTrialDto dto) {
        trialService.save(dto);
    }

    @PostMapping("/create/image/{id}")
    public void addImage(@RequestParam("image") MultipartFile image,
                         @PathVariable("id") Long id) throws IOException {
        trialService.savePhotoFor(id, image);
    }

    @PutMapping("/update")
    public Trial updateTrial(@RequestBody UpdateTrialDto dto) {
        return trialService.update(dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTrial(@PathVariable("id") @Min(1) Long id) {
        trialService.delete(id);
    }

}
