package io.jsoft.scrumnotesmicroservice.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "project")
@Data
public class Project {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;
    @Column(name = "project_name")
    private String projectName;
}
