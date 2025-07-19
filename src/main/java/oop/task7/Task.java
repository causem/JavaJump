package oop.task7;

public class Task extends Item implements Completable {
    String dueDate;
    String status;

    public Task(String title, String dueDate, String status) {
        super(title);
        this.dueDate = dueDate;
        this.status = status;
    }

    @Override
    public void complete(){
        this.status = "DONE";
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task: " + getTitle() + ", due: " + dueDate + ", status: " + status;
    }
}
