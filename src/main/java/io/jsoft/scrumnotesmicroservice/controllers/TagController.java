package io.jsoft.scrumnotesmicroservice.controllers;

import io.jsoft.scrumnotesmicroservice.model.Tag;
import io.jsoft.scrumnotesmicroservice.services.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tags")
@Slf4j
public class TagController {

    @Autowired
    private TagService tagService;

    // create methods
    @PostMapping("/add")
    public Tag addNewTag(@RequestBody Tag tagToAdd){
        return tagService.addNewTag(tagToAdd);
    }

    // update methods
    @PutMapping("/update")
    public Tag updateTag(@RequestBody Tag tagToUpdate) {
        return tagService.updateTag(tagToUpdate);
    }

    // read methods
    @GetMapping("")
    public List getAllTags(@RequestParam Optional<String> tagName) {

        if(tagName.isPresent()) {
            return tagService.getAllTagsByName(tagName.get());
        }

        return tagService.getAllTags();
    }

    @GetMapping("/{id}")
    public Tag getTagById(@PathVariable long id) {
        return tagService.getTagById(id);
    }

    // delete methods
    @DeleteMapping("/{id}")
    public void deleteTagByID(@PathVariable long id) {
        tagService.deleteTagById(id);
    }

}
