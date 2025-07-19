package streams;

import java.util.List;

//Wyświetl tylko pierwsze 3 elementy z listy liczb większych od 5.
public class Task10 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(3, 6, 8, 10, 1, 7);
        nums.stream().filter(n -> n > 5).limit(3).forEach(System.out::println);

    }
}
