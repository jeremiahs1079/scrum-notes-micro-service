package io.jsoft.scrumnotesmicroservice.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "scrumnotes")
public class ScrumNote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "project_id")
    private long project_id;
    @Column(name = "content")
    private String content;
    @Column(name = "note_date")
    private Date noteDate;
}
