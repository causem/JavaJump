package concurrency.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskGenerator implements Runnable {
    @Override
    public void run() {
        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String title = "Task" + i;
            LocalDate dueDate = LocalDate.now().plusDays(i);
            Task task = new Task(dueDate, title);
            tasks.add(task);
            System.out.println(task);
        }
    }
}
