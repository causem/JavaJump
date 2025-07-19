package collections;

import java.util.ArrayList;
import java.util.List;

// stwórz listę imion (List<String>) i wypisz każde imię. (List, add, for-each)
public class Task1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Beata");
        names.add("Agata");
        names.add("Karolina");

        System.out.println(names);

        for (String name :names){
            System.out.println(name);
        }
    }
}
