package oop.task7;

import java.util.ArrayList;
import java.util.List;

public class Project {
    String name;
    List<Task> tasks;

    public Project(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    void addTask(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public void printProject() {
        System.out.println("Project: " + name);
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
