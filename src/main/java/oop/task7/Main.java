package oop.task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("Make a project", "2025-09-01", "TODO");
        Task t2 = new Task("Finish a final task", "2025-07-01", "DONE");
        Task t3 = new Task("Buy a book", "2025-07-21", "TODO");
        Task t4 = new Task("Learn Java", "2025-12-21", "IN PROGRESS");


        List<Task> tasks = new ArrayList<>();
        tasks.add(t1);
        tasks.add(t2);
        tasks.add(t3);
        tasks.add(t4);

        Project project = new Project("MY Project", tasks);
        project.printProject();

        System.out.println();
        System.out.println("The list of tasks before calling 'complete' method:");
        for(Task t: tasks){
            System.out.println("Task: " + t.getTitle() + ", status: " + t.getStatus());
        }

        System.out.println();
        System.out.println("Calling out 'complete' method on t1 and t3");
        t1.complete();
        t3.complete();

        System.out.println();
        System.out.println("The list of tasks after calling 'complete' method:");
        for(Task t: tasks){
            System.out.println("Task: " + t.getTitle() + ", status: " + t.getStatus());
        }


    }
}
