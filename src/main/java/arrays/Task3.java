package arrays;

import java.util.Arrays;

//znajdź największą licznę w tablicy
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,15,9,10,11,12};
        int max = array[0];

        for(int n:array){
            if(n>max){
                max=n;
            }
        }
        System.out.println("Największa liczba to " + max);
    }
}
