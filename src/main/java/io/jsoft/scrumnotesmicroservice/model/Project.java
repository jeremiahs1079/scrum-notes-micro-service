package io.jsoft.scrumnotesmicroservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


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
    @Column(name="description")
    private String description;
    @Column(name="start_date")
    private Date startDate;
    @Column(name="end_date")
    private Date endDte;

}
