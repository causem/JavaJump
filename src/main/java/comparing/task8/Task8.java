package comparing.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {

        List<String> names = List.of("Anna", "Zuzanna", "Beata", "Karolina", "Marta");

        List<String> sortedNames = new ArrayList<>(names);

        sortedNames.sort(Comparator.comparing(String::toString));

        System.out.println("Sorted names ascending:");
        for (String sortedName : sortedNames) {
            System.out.println(sortedName);
        }
    }
}
