package org.example;

public class Task {
    private String title;
    private String description;
    private String deadline;
    private boolean completed;

    public Task(String title, String description, String deadline) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.completed = false;

    }

    public void done() {
        this.completed = true;
    }

    public String isCompleted() {
        if (completed) {
            return "[✓]";
        } else {
            return "[]";
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getDescription() {
        return description;
    }

    public void showTask() {

    }

    public String outPut() {
        return isCompleted() + " " + title + "(до " + deadline + ") - " + description;
    }
}
