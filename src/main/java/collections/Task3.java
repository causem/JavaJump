package collections;

import java.util.HashMap;
import java.util.Map;

//. Stwórz mapę imię → wiek i wypisz wszystkie wpisy.
//➤ Map<String, Integer>, put, for (entry)
public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> personAge = new HashMap<>();
        personAge.put("Marta", 18);
        personAge.put("Michał", 30);
        personAge.put("Karolina", 28);
        personAge.put("Karol", 21);

        for (Map.Entry<String, Integer> entry : personAge.entrySet()) {
            System.out.println(entry.getKey() + ", wiek: " + entry.getValue());
        }
    }
}
