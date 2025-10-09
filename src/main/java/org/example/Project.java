package org.example;

import java.util.ArrayList;
import java.util.List;

public class Project extends Named {
    private List<Task> taskList;


    public Project(String name) {
        super(name);
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }


    public void removeTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
        }
    }

    public List<Task> getTask_list() {
        return taskList;
    }

}
