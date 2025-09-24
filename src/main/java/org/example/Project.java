package org.example;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name_of_project;
    private List<Task> task_list;

    public Project(String name_of_project) {
        this.name_of_project = name_of_project;
        this.task_list = new ArrayList<>();
    }

    public void addTask(Task task) {
        task_list.add(task);
    }

    public void removeTask(int index) {
        for (int i = 0; i < task_list.size(); i++) {
            if (i == index) {
                task_list.remove(i);
                break;
            }
        }
    }

    public List<Task> getTask_list() {
        return task_list;
    }

    public String getName() {
        return name_of_project;
    }

    public void output() {
        System.out.println("Проект " + name_of_project);
        if (task_list.isEmpty()) {
            System.out.println("Еще нет никаких задач.");
        } else {
            for (int i = 0; i < task_list.size(); i++) {
                System.out.println(i + '.' + task_list.get(i).outPut());
            }
        }
    }
}
