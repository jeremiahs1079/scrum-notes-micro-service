package io.jsoft.scrumnotesmicroservice.repositories;

import io.jsoft.scrumnotesmicroservice.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    List findByProjectName(String projectName);
    Project findById(long id);
}
