package org.example;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Project> projects;

    public User(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void showProjects() {
        for (int i = 0; i < projects.size(); i++) {
            System.out.print(i + ". ");
            projects.get(i).output();
        }
    }

    public String output() {
        return "Пользователь: " + name;
    }
}
