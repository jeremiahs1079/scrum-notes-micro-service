package io.jsoft.scrumnotesmicroservice.services;

import io.jsoft.scrumnotesmicroservice.model.Tag;

import java.util.List;

public interface TagService {
    List getAllTags();
    List getAllTagsByName(String tagName);
    Tag getTagById(long id);
    Tag addNewTag(Tag tagToAdd);
    Tag updateTag(Tag tagToUpdate);
    void deleteTagById(long id);
}
