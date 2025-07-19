package streams;
// Oblicz sumę wszystkich liczb parzystych z listy.

import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5, 6);

        int sum = nums.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
