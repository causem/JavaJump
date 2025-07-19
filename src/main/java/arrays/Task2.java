package arrays;

public class Task2 {
    // zlicz ile liczb większych od 10
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 10, 12, 14, 16, 20, 21};

        int count = 0;
        for (int n : numbers) {
            if (n > 10) {
                count++;
            }
        }
        System.out.println(count);
    }
}
