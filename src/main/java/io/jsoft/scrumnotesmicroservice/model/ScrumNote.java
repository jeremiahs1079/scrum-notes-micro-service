package io.jsoft.scrumnotesmicroservice.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "scrumnotes")
@Data
public class ScrumNote {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "project_id")
    private long projectId;
    @Column(name = "content")
    private String content;
    @Column(name = "note_date")
    private Date noteDate;
}
