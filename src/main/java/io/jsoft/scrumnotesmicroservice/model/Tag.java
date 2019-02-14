package io.jsoft.scrumnotesmicroservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tags")
@Data
public class Tag {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "tag_name")
    private String tagName;
}
