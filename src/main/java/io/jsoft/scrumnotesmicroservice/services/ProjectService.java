package io.jsoft.scrumnotesmicroservice.services;

import io.jsoft.scrumnotesmicroservice.model.Project;

import java.util.List;

public interface ProjectService {
    List getAllProjects();
    Project getProjectById(long id);
    List getProjectByName(String projectName);
    Project saveProject(Project projectToSave);
    void deleteProject(long id);
}
