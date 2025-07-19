package streams;

import java.util.List;

// Posortuj listę imion alfabetycznie.
public class Task4 {

    public static void main(String[] args) {

        List<String> names = List.of("Tom", "Anna", "John", "Zoe");
        names.stream().sorted().forEach(System.out::println);
    }
}
