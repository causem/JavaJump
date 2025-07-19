package loops;

import java.util.Scanner;

//Sprawdź czt liczba jest podzielna przez 3 i 5
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = sc.nextInt();
        checkModulo3And5(number);
    }

     static void checkModulo3And5(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Podana liczba " + n + " jest podzielna przez 3 i 5.");
        } else {
            System.out.println("Podana liczba " + n + " nie jest podzielna przez 3 i 5.");
        }
    }
}

