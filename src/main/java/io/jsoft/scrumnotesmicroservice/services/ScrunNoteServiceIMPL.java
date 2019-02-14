package io.jsoft.scrumnotesmicroservice.services;

import io.jsoft.scrumnotesmicroservice.model.ScrumNote;
import io.jsoft.scrumnotesmicroservice.repositories.ScrumNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScrunNoteServiceIMPL implements ScrumNoteService {

    @Autowired
    private ScrumNoteRepository scrumNoteRepository;

    @Override
    public List getAllScrumNotes() {
        return (List) scrumNoteRepository.findAll();
    }

    @Override
    public List getAllScrumNotesForProject(long projectId) {
        return scrumNoteRepository.findAllByProjectId(projectId);
    }

    @Override
    public ScrumNote getScrumNoteById(long scrumNoteId) {
        return scrumNoteRepository.findById(scrumNoteId).get();
    }

    @Override
    public ScrumNote addNewScrumNote(ScrumNote noteToAdd) {
        return scrumNoteRepository.save(noteToAdd);
    }

    @Override
    public ScrumNote updateScrumNote(ScrumNote noteToUpdate) {
        return scrumNoteRepository.save(noteToUpdate);
    }

    @Override
    public void deleteScrumNote(long scrumNoteId) {
        scrumNoteRepository.deleteById(scrumNoteId);
    }
}
