package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("Илья");
        boolean start = true;
        while (start) {
            System.out.println("\n=== To-Do List ===");
            System.out.println("1. Создать проект");
            System.out.println("2. Добавить задачу");
            System.out.println("3. Показать задачи");
            System.out.println("4. Отметить задачу выполненной");
            System.out.println("5. Удалить задачу");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1: {
                    System.out.print("Название проекта: ");
                    String projectName = scanner.nextLine();
                    user.addProject(new Project(projectName));
                    break;
                }
                case 2: {
                    if (user.getProjects().isEmpty()) {
                        System.out.println("Сначала создайте проект!");
                        break;
                    }
                    System.out.println("Выберите проект по индексу:");
                    for (int i = 0; i < user.getProjects().size(); i++) {
                        System.out.println(i + ". " + user.getProjects().get(i).getName());
                    }
                    int pIndex = scanner.nextInt();
                    scanner.nextLine();

                    Project selectedProject = user.getProjects().get(pIndex);
                    System.out.println("Введите название задачи: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите описание: ");
                    String desc = scanner.nextLine();
                    System.out.print("Введите дедлайн (год-месяц-день): ");
                    String date = scanner.nextLine();
                    Task newTask = new Task(title, desc, date);
                    selectedProject.addTask(newTask);
                    System.out.println("Задача добавлена!");
                    break;
                }
                case 3: {
                    System.out.println("Задачи:\n");
                    for (int i = 0; i < user.getProjects().size(); i++) {
                        System.out.println(i + ". " + user.getProjects().get(i).getName());
                    }
                    break;
                }
                case 4: {
                    if (user.getProjects().isEmpty()) {
                        System.out.println("Нет проектов.");
                        break;
                    }
                    System.out.println("Выберите проект:");
                    for (int i = 0; i < user.getProjects().size(); i++) {
                        System.out.println(i + ". " + user.getProjects().get(i).getName());
                    }
                    int pIndex = scanner.nextInt();
                    scanner.nextLine();
                    Project selectedProject = user.getProjects().get(pIndex);

                    if (selectedProject.getTask_list().isEmpty()) {
                        System.out.println("Задач нет.");
                        break;
                    }
                    System.out.println("Выберите задачу по индексу для отметки как выполненной:");
                    for (int i = 0; i < selectedProject.getTask_list().size(); i++) {
                        System.out.println(i + ". " + selectedProject.getTask_list().get(i).outPut());
                    }
                    int tIndex = scanner.nextInt();
                    scanner.nextLine();

                    selectedProject.getTask_list().get(tIndex).done();
                    break;
                }
                case 5: {
                    System.out.println("Выберите проект:");
                    for (int i = 0; i < user.getProjects().size(); i++) {
                        System.out.println(i + ". " + user.getProjects().get(i).getName());
                    }
                    int pIndex = scanner.nextInt();
                    scanner.nextLine();
                    Project selectedProject = user.getProjects().get(pIndex);
                    System.out.println("Выберите задачу по индексу для удаления:");
                    for (int i = 0; i < selectedProject.getTask_list().size(); i++) {
                        System.out.println(i + ". " + selectedProject.getTask_list().get(i).outPut());
                    }
                    int tIndex = scanner.nextInt();
                    scanner.nextLine();

                    selectedProject.removeTask(tIndex);
                }
                case 0: {
                    start = false;
                    break;
                }
            }
        }
    }
}