package io.jsoft.scrumnotesmicroservice.controllers;

import io.jsoft.scrumnotesmicroservice.model.ScrumNote;
import io.jsoft.scrumnotesmicroservice.services.ScrumNoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/scrumnotes")
@Slf4j
public class ScrumNoteController {

    @Autowired
    private ScrumNoteService scrumNoteService;

    // create methods

    // update methods

    // read methods
    @GetMapping("")
    public List getAllScrumNotes() {
        return scrumNoteService.getAllScrumNotes();
    }

    @GetMapping("/{scrumNoteId}")
    public ScrumNote getScrumNoteById(@PathVariable long scrumNoteId) {
        return scrumNoteService.getScrumNoteById(scrumNoteId);
    }

    // delete methods

}
