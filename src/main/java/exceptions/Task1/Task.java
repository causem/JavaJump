package exceptions.Task1;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;

    public Task(String title, LocalDate dueDate) throws InvalidTaskException {
        if (title == null || title.trim().isEmpty()) {
            throw new InvalidTaskException("Tytuł zadania nie może być pusty.");
        }
        if (dueDate == null) {
            throw new InvalidTaskException("Data wykonania nie może być pusta.");
        }

        if (dueDate.isBefore(LocalDate.now())) {
            throw new InvalidTaskException("Termin wykonania nie może być w przeszłości.");
        }
        this.title = title;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
