package io.jsoft.scrumnotesmicroservice.controllers;

import io.jsoft.scrumnotesmicroservice.model.ScrumNote;
import io.jsoft.scrumnotesmicroservice.services.ScrumNoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scrumnotes")
@Slf4j
@CrossOrigin(origins = "*")
public class ScrumNoteController {

    @Autowired
    private ScrumNoteService scrumNoteService;

    // create methods
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ScrumNote addScrumNote(@RequestBody ScrumNote scrumNote) {
        return scrumNoteService.addNewScrumNote(scrumNote);
    }

    // update methods
    @PutMapping("/update")
    public ScrumNote updateScrumNote(@RequestBody ScrumNote scrumNote) {
        return scrumNoteService.updateScrumNote(scrumNote);
    }

    // read methods
    @GetMapping("")
    public List getAllScrumNotes() {
        return scrumNoteService.getAllScrumNotes();
    }

    @GetMapping("/{scrumNoteId}")
    public ScrumNote getScrumNoteById(@PathVariable long scrumNoteId) {
        return scrumNoteService.getScrumNoteById(scrumNoteId);
    }

    @GetMapping("/project/{projectId}")
    public List getScrumNotesByProject(@PathVariable long projectId) {
        return scrumNoteService.getAllScrumNotesForProject(projectId);
    }

    // delete methods
    @DeleteMapping("/{id}")
    public void deleteScrumNote(@PathVariable long id) {
        scrumNoteService.deleteScrumNote(id);
    }

}
