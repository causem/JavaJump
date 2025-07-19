package loops;


import java.util.Scanner;

//czy podana liczba jest dodatnia, ujemna, równa zero
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = sc.nextInt();
        checkNumber(number);
    }

    public static void checkNumber(int n){
        if(n<0){
            System.out.println("Podana liczba jest mniejsza od zera");
        } else if(n>0) {
            System.out.println("Podana liczba jest większa od zera");
        } else {
            System.out.println("Podana liczba jest równa zero");
        }
    }
}
