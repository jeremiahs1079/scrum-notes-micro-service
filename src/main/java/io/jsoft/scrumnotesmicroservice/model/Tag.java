package io.jsoft.scrumnotesmicroservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tags")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(
                name = "get_project_tags",
                procedureName = "getProjectTags",
                parameters = {
                        @StoredProcedureParameter(name = "p_id", mode = ParameterMode.IN, type = Long.class),
                },
                resultClasses = Tag.class
        ),
        @NamedStoredProcedureQuery(
                name = "get_all_tags",
                procedureName = "get_all_tags",
                resultClasses = Tag.class,
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, type = Void.class),
                }
        )
})
@Data
public class Tag {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "tag_name")
    private String tagName;
}
