package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Project> projects;

    public User(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

}
