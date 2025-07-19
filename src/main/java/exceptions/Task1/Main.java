package exceptions.Task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        try {
            Task t1 = new Task("", LocalDate.of(2025, 8, 30));
        } catch (InvalidTaskException e) {
            System.out.println("Błąd przy tworzeniu: " + e.getMessage());
        }

        try {
            Task t2 = new Task("Learn Java", LocalDate.of(2025, 6, 30));
        } catch (InvalidTaskException e) {
            System.out.println("Błąd przy tworzeniu: " + e.getMessage());
        }

        try {
            Task t3 = new Task("Correct Task", LocalDate.of(2025, 11, 30));
        } catch (InvalidTaskException e) {
            System.out.println("Błąd przy tworzeniu: " + e.getMessage());
        }
    }
}
