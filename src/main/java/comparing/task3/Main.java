package comparing.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", 4.5));
        students.add(new Student("Karol", 4.8));
        students.add(new Student("Agata", 4.0));
        students.add(new Student("Igor", 5.0));


        students.sort(Comparator.comparing(Student::getName));

        System.out.println("Sorted list of student by name ascending:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
