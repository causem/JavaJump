package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Wypisz tylko osoby starsze niż 18 lat z mapy imię → wiek.
//➤ if, map.get(key)
public class Task4 {
    public static void main(String[] args) {
        Map<String, Integer> personAge = new HashMap<>();
        personAge.put("Marta", 19);
        personAge.put("Michał", 30);
        personAge.put("Karolina", 28);
        personAge.put("Karol", 21);
        personAge.put("Ilona", 12);
        personAge.put("Leon", 12);
        personAge.put("Marcel", 4);

        for (Map.Entry<String, Integer> e : personAge.entrySet()) {
            if (e.getValue() > 18) {
                System.out.println(e.getKey());
            }
        }
    }
}
