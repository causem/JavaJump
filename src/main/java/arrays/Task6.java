package arrays;

import java.util.Scanner;

//program ktory zlicza ile dana liczba pojawia się w tablicy
public class Task6 {

    public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 3, 4, 3, 2, 2};
        int n = 1;
        System.out.println("Liczba " + n + " występuje w tablicy " + checkOccurenceOfNumber(array, n) + " razy");
    }

    static int checkOccurenceOfNumber(int[] arr, int n) {
        int count = 0;
        for (int a : arr) {
            if (n == a) {
                count++;
            }
        }
        return count;
    }

}
