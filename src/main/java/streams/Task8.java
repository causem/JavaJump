package streams;

import java.util.List;
import java.util.stream.Collectors;

//Przekształć listę słów do listy długości tych słów.
public class Task8 {
    public static void main(String[] args) {

        List<String> words = List.of("Hi", "Stream", "API");
        List<Integer> wordsLength = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());

        wordsLength.forEach(System.out::println);
    }
}
