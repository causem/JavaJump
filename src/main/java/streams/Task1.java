package streams;
// Policz liczbę elementów większych niż 10 w liście liczb.

import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 15, 20, 8, 11);
        long count = nums.stream()
                .filter(n -> n > 10)
                .count();

        System.out.println("Liczba elementów większych niż 10: " + count);

    }
}
