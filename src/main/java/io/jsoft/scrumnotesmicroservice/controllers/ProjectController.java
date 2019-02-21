package io.jsoft.scrumnotesmicroservice.controllers;

import io.jsoft.scrumnotesmicroservice.model.Project;
import io.jsoft.scrumnotesmicroservice.services.ProjectService;
import io.jsoft.scrumnotesmicroservice.services.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projects")
@Slf4j
@CrossOrigin(origins = "*")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private TagService tagService;

    // create methods
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Project addProject(@RequestBody Project project) {

        return projectService.saveProject(project);
    }

    // update methods
    @PutMapping("/update")
    public Project updateProject(@RequestBody Project project) {
        Project projectToUpdate = this.projectService.getProjectById(project.getId());

        if(projectToUpdate != null) {
            projectService.saveProject(project);
        }

        return projectService.getProjectById(project.getId());
    }

    //read methods
    @GetMapping("")
    public List getAll(@RequestParam(value = "projectname") Optional<String> projectName) {

        if(projectName.isPresent()) {
            return projectService.getProjectByName(projectName.get());
        }

        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public Project getById(@PathVariable long id) {
//        List tags = tagService.getProjectTags(id);

//        log.info("Tags: {}", tags);
        return projectService.getProjectById(id);
    }



    // delete methods
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable long id) {
        projectService.deleteProject(id);
    }

}
