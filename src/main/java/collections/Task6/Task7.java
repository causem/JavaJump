package collections.Task6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {

        List<Task> allTasks = new ArrayList<>();
        allTasks.add(new Task("Task1", "TODO"));
        allTasks.add(new Task("Task2", "DONE"));
        allTasks.add(new Task("Task3", "IN PROGRESS"));
        allTasks.add(new Task("Task4", "TODO"));
        allTasks.add(new Task("Task5", "DONE"));
        allTasks.add(new Task("Task6", "DONE"));

        Map<String, List<Task>> taskByStatus = new HashMap<>();

        for (Task t : allTasks) {
            List<Task> list = taskByStatus.getOrDefault(t.getStatus(), new ArrayList<>());
            list.add(t);
            taskByStatus.put(t.getStatus(), list);
        }

        System.out.println("Zadania z statusem TODO:");
        List<Task> todos = taskByStatus.getOrDefault("TODO", List.of());
        for (Task t : todos) {
            System.out.println(t.getName());
        }
    }
}
