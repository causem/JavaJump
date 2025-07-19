package streams;

import java.util.List;

//Wyświetl tylko unikalne liczby z listy z powtórzeniami.
public class Task9 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4);
        nums.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
