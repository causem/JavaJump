package loops;

import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int age = sc.nextInt();
        checkAge(age);
    }


    public static void checkAge(int age){
        if (age<0){
            System.out.println("Podano liczbę ujemną. To nie jest prawidłowy wiek");
        } else if(age>=18){
            System.out.println("Dorosły");
        } else {
            System.out.println("Niepełnoletni");
        }
    }
}
