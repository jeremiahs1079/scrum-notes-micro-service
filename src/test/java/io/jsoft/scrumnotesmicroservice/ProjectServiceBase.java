package io.jsoft.scrumnotesmicroservice;

import io.jsoft.scrumnotesmicroservice.controllers.ProjectController;
import io.jsoft.scrumnotesmicroservice.model.Project;
import io.jsoft.scrumnotesmicroservice.repositories.ProjectRepository;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.any;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ScrumNotesMicroServiceApplication.class)
public abstract class ProjectServiceBase {

    @Autowired
    ProjectController projectController;

    @MockBean
    private ProjectRepository projectRepository;

    @Before
    public void setup() {
        Project project = new Project();
        project.setProjectName("Test Project");
        project.setId(1L);

        Mockito.when(projectRepository.save(any(Project.class))).thenReturn(project);
        RestAssuredMockMvc.standaloneSetup(projectController);



        Mockito.when(projectRepository.findById(1L)).thenReturn(project);
    }
}
