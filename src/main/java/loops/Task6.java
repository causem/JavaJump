package loops;

import java.util.Scanner;

//Parzysta czy nieparzysta
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = sc.nextInt();
        checkEvenOrOdd(number);
    }

    public static void checkEvenOrOdd(int n) {
        String response = (n % 2 == 0) ? "Licbza " + n + " jest parzysta." : "Licbza " + n + " jest nieparzysta.";
        System.out.println(response);
    }
}
