package filehandling.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileHandler {
    public static void main(String[] args) {
        // Creating lists of tasks
        List<String> tasks = Arrays.asList(
                "Buy groceries",
                "Finish homework",
                "Call the dentist",
                "Workout at 6PM"
        );
        String filename = "tasks.txt";
        Path filePath = Paths.get(filename);


        // Saving to the file
        try {
            Files.write(filePath, tasks);
            System.out.println("Tasks saved to the file: " + filename);
        } catch (IOException e) {
            throw new RuntimeException("Error saving the file: " + e.getMessage());
        }

        // Reading from the file (existing)
        if (Files.exists(filePath)) {
            try {
                List<String> readTasks = Files.readAllLines(filePath);
                System.out.println("Tasks read from the file");
                readTasks.forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException("Error reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("The file does not exist: " + filePath);
        }

        Path nonExistingFilePath = Paths.get("missing_tasks.txt");
        // Reading from the file (non-existing)
        if (Files.exists(nonExistingFilePath)) {
            try {
                List<String> readTasks = Files.readAllLines(nonExistingFilePath);
                System.out.println("Tasks read from the file");
                readTasks.forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException("Error reading the file: " + e.getMessage());
            }
        } else {
            System.out.println("The file does not exist: " + nonExistingFilePath);
        }
    }
}
