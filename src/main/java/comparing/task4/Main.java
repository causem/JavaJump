package comparing.task4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee(1, "Anna Nowak", "QA Engineer");
        Employee empl2 = new Employee(2, "Jan Kowalski", "Software Engineer");
        Employee empl3 = new Employee(1, "Anna Nowak-Kowalska", "Lead QA Engineer");
        Employee empl4 = new Employee(3, "Jerzy Nowak", "Data Engineer");

        // should return true
        System.out.println(empl1.equals(empl3));

        // should return false
        System.out.println(empl2.equals(empl4));

        Set<Employee> employees = new HashSet<>();
        employees.add(empl1);
        employees.add(empl2);
        employees.add(empl3);
        employees.add(empl4);

        for (Employee e : employees) {
            System.out.println(e);
        }

        // should print 3
        System.out.println("The number of unique employyes: " + employees.size());
    }
}
