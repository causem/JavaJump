package collections;

import java.util.ArrayList;
import java.util.List;

//Sprawdź, czy lista imion zawiera imię „Anna”.(.contains())
public class Task2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Beata");
        names.add("Agata");
        names.add("Karolina");

        System.out.println(names.contains("Anna"));
    }
}
