package collections.Task6;

import java.util.ArrayList;
import java.util.List;

//6.  Zadanie główne: przefiltruj listę zadań po statusie “DONE”.
//➤ Klasa Task, if, List<Task>
public class Task6 {
    public static void main(String[] args) {


        List<Task> allTasks = new ArrayList<>();
        allTasks.add(new Task("Task1", "TODO"));
        allTasks.add(new Task("Task2", "DONE"));
        allTasks.add(new Task("Task3", "IN PROGRESS"));
        allTasks.add(new Task("Task4", "TODO"));
        allTasks.add(new Task("Task5", "DONE"));
        allTasks.add(new Task("Task6", "DONE"));

        List<Task> doneTasks = new ArrayList<>();
        for (Task task : allTasks) {
            if ("DONE".equals(task.getStatus())) {
                doneTasks.add(task);
            }
        }

        System.out.println("Done tasks:");
        for (Task task : doneTasks) {
            System.out.println(task.getName());
        }

    }
}