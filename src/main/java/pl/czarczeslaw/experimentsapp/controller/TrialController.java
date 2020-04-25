package pl.czarczeslaw.experimentsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.czarczeslaw.experimentsapp.model.Trial;
import pl.czarczeslaw.experimentsapp.model.dto.CreateTrialDto;
import pl.czarczeslaw.experimentsapp.model.dto.UpdateTrialDto;
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

    @GetMapping("/get/page/{no}&{size}")
    public Page<Trial> getPage(@PathVariable("no") int no,
                               @PathVariable("size") int size) {
        return trialService.getPage(PageRequest.of(no, size));
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createTrial(@RequestBody CreateTrialDto dto) {
        trialService.save(dto);
    }

    @PutMapping("/update")
    public Trial updateTrial(@RequestBody UpdateTrialDto dto) {
        return trialService.update(dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTrial(@PathVariable("id") Long id) {
        trialService.delete(id);
    }

}
