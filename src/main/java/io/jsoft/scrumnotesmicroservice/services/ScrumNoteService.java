package io.jsoft.scrumnotesmicroservice.services;

import io.jsoft.scrumnotesmicroservice.model.ScrumNote;

import java.util.List;

public interface ScrumNoteService {
    List getAllScrumNotes();
    List getAllScrumNotesForProject(long projectId);
    ScrumNote getScrumNoteById(long scrumNoteId);
    ScrumNote addNewScrumNote(ScrumNote noteToAdd);
    ScrumNote updateScrumNote(ScrumNote noteToUpdate);
    void deleteScrumNote(long scrumNoteId);
}
