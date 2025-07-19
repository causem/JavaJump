package streams;
//Wyświetl wszystkie słowa zaczynające się na literę 'A' z listy Stringów.

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Cherry");

        words.stream()
                .filter(w -> w.charAt(0) == 'A')
                .forEach(System.out::println);
    }
}
