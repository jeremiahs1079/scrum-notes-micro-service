package io.jsoft.scrumnotesmicroservice.services;

import io.jsoft.scrumnotesmicroservice.model.Project;
import io.jsoft.scrumnotesmicroservice.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceIMPL implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List getAllProjects() {
        return (List) projectRepository.findAll();
    }

    @Override
    public Project getProjectById(long id) {
        return projectRepository.findById(id);
    }

    @Override
    public List getProjectByName(String projectName) {
        return projectRepository.findByProjectName(projectName);
    }

    @Override
    public Project saveProject(Project projectToSave) {
        return projectRepository.save(projectToSave);
    }

    @Override
    public void deleteProject(long id) {
        projectRepository.deleteById(id);
    }
}
