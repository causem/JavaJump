package comparing.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 4.5));
        students.add(new Student("Karol", 4.8));
        students.add(new Student("Agata", 4.0));
        students.add(new Student("Igor", 5.0));


        Collections.sort(students);

        System.out.println("Sorted list of student by average grade descending:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
