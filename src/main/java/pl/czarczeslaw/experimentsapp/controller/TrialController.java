package pl.czarczeslaw.experimentsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;
import pl.czarczeslaw.experimentsapp.service.TrialService;

import java.util.List;

@RestController
@RequestMapping(path = "/trial")
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
    public Trial getById(@PathVariable("id") Long id) {
        return trialService.getById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createTrial(@RequestBody CreateTrialDto dto){
        trialService.save(dto);
    }

}
