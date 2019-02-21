package io.jsoft.scrumnotesmicroservice.repositories;

import io.jsoft.scrumnotesmicroservice.model.Tag;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
    List findByTagName(String tagName);

    @Procedure(procedureName = "getProjectTags")
    List getProjectTags(long p_id);

    @Procedure(name = "get_all_tags")
    List getAllTags();

}
