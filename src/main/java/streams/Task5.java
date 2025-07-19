package streams;


import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Znajdź najdłuższe słowo w liście słów (Optional).
public class Task5 {
    public static void main(String[] args) {

        List<String> words = List.of("Java", "Concurrency", "Stream");

        Optional<String> longestString = words.stream().max(Comparator.comparingInt(String::length));

        longestString.ifPresent(System.out::println);

    }
}
