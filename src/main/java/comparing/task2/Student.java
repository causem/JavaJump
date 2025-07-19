package comparing.task2;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    double averageGrade;

    public Student(String name, Double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.averageGrade, this.averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(averageGrade, student.averageGrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, averageGrade);
    }

}
