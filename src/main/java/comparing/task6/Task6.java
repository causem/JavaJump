package comparing.task6;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Podaj 5 liczb całkowitych, po każdej podanej wprowadź enter");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Liczba nr " + (i + 1) + " to: ");
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Posortowane liczby: ");
        for (int n : numbers) {
            System.out.println(n + "");
        }

    }
}
