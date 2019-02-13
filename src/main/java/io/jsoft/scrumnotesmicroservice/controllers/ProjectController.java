package io.jsoft.scrumnotesmicroservice.controllers;

import io.jsoft.scrumnotesmicroservice.model.Project;
import io.jsoft.scrumnotesmicroservice.repositories.ProjectRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
@Slf4j
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    // create methods
    @PostMapping("/add")
    public Project addProject(@RequestBody Project project) {
        log.info("Starting Add Method");
        log.info("Project to add: {}", project);
        Project savedProject = projectRepository.save(project);

        return savedProject;
    }
    // update methods
    @PutMapping("/update")
    public Project updateProject(@RequestBody Project project) {
        Project projectToUpdate = this.projectRepository.findById(project.getId());

        if(projectToUpdate != null) {
            projectRepository.save(project);
        }

        return projectRepository.findById(project.getId());
    }

    //read methods
    @GetMapping("")
    public List getAll(@RequestParam(value = "projectname") Optional<String> projectName) {

        if(projectName.isPresent()) {
            return projectRepository.findByProjectName(projectName.get());
        }

        return (List) projectRepository.findAll();
    }

    @GetMapping("/{id}")
    public Project getById(@PathVariable long id) {
        return projectRepository.findById(id);
    }



    // delete methods
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable long id) {
        projectRepository.deleteById(id);
    }

}
