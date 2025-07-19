package loops;

import java.util.Scanner;

//najwieksza z trzech liczb
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = sc.nextInt();
        System.out.println("Podaj drugą liczbę");
        int b = sc.nextInt();
        System.out.println("Podaj trzecią liczbę");
        int c = sc.nextInt();
        System.out.println("Największa liczba to: " + checkMax(a,b,c));
    }

    public static int checkMax(int a, int b, int c) {
        if (a >= b) {
            if (a >= c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b >= c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static int checkMaxJava(int a, int b, int c){
       return Math.max(c,(Math.max(a,b)));
    }
}
