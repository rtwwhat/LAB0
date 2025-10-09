package org.example;

interface Completable {
    void markCompleted();

    boolean isCompleted();

    String getStatus();
}
