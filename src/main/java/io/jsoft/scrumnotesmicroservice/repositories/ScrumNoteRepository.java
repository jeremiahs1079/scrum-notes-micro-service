package io.jsoft.scrumnotesmicroservice.repositories;

import io.jsoft.scrumnotesmicroservice.model.ScrumNote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScrumNoteRepository extends CrudRepository<ScrumNote, Long> {
    List findAllByProjectId(long projectId);
}
