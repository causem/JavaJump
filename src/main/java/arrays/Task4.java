package arrays;
//suma wszystkich elemntów w tablicy
public class Task4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Suma wszystich elementów w tablicy to: " + sumArray(arr));
    }

    static int sumArray(int[] array){
        int sum=0;
        for(int n:array){
            sum +=n;
        }
        return sum;
    }
}
