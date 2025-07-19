package arrays;
//srednia arytmetyczna tablicy typu double

import java.util.ArrayList;
import java.util.List;

public class Task7 {


    public static void main(String[] args) {
        double[] array = {1.5, 3.5, 4.5, 6.5};

        System.out.println("srednia arytmetyczna elementów w tablicy to:  " + average(array));

    }

    static double average(double[] arr) {
        double sum = 0;
        for (double n : arr) {
            sum += n;
        }
        return sum / arr.length;
    }
}
