package streams;

import java.util.List;

//Sprawdź, czy w liście liczb znajduje się liczba większa niż 100.
public class Task6 {
    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 20, 99, 50, 1123);
        boolean contains = nums.stream().anyMatch(n -> n > 100);
        System.out.println(contains);
    }
}
