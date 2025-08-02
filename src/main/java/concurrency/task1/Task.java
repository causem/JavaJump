package concurrency.task1;

import java.time.LocalDate;

public class Task {
    String name;
    private LocalDate dueDate;

    public Task(LocalDate dueDate, String name) {
        this.dueDate = dueDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
