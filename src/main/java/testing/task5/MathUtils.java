package testing.task5;

public class MathUtils {
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The number cannot be less than 0.");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
