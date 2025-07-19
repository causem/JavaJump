package streams;
//Stwórz nową listę zawierającą kwadraty liczb z listy.

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());


        squareNums.forEach(System.out::println);
    }
}
