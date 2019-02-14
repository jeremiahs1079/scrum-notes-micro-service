package io.jsoft.scrumnotesmicroservice.services;

import io.jsoft.scrumnotesmicroservice.model.Tag;
import io.jsoft.scrumnotesmicroservice.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceIMPL implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public List getAllTags() {
        return (List) tagRepository.findAll();
    }

    @Override
    public Tag getTagById(long id) {
        return tagRepository.findById(id).get();
    }

    @Override
    public Tag addNewTag(Tag tagToAdd) {
        return tagRepository.save(tagToAdd);
    }

    @Override
    public Tag updateTag(Tag tagToUpdate) {
        return tagRepository.save(tagToUpdate);
    }

    @Override
    public void deleteTagById(long id) {
        tagRepository.deleteById(id);
    }

    @Override
    public List getAllTagsByName(String tagName) {
        return tagRepository.findByTagName(tagName);
    }
}
