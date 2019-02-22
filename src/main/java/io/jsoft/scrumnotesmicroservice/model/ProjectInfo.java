package io.jsoft.scrumnotesmicroservice.model;

import lombok.Data;

import java.util.List;

@Data
public class ProjectInfo {

    private Project project;
    private List notes;


}
