package org.example;

public class Task extends Named implements Completable {
    private String description;
    private String deadline;
    private boolean completed;

    public Task(String title, String description, String deadline) {
        super(title);
        this.description = description;
        this.deadline = deadline;
        this.completed = false;
    }

    @Override
    public void markCompleted() {
        this.completed = true;
    }


    @Override
    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String getStatus() {
        return completed ? "[✓]" : "[ ]";
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public String outPut() {
        return getStatus() + " " + getName() + " (до " + deadline + ") - " + description;
    }
}
