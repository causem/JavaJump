package string;
// Napisz metodę, która sprawdza, czy podany String jest palindromem (ignorując wielkość liter oraz spacje).
public class Task2 {

    public static void main(String[] args) {
        String s = "Kobyła ma mały bok";
        System.out.println("Podane słowo jest palindronmem?:  " + checkIfPalindrome(s));
    }

    static boolean checkIfPalindrome(String word){
        String w = word.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(w).reverse().toString();
        return w.equals(reversed);

    }
}
