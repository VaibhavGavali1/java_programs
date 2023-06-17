//Example of array in 1D.

import java.util.Scanner;

public class ExArray3 {
    public static void main(String[] args) {
        int i;
        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;
        System.out.println("Your array: ");
        for (i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Addition is " + sum);
    }
}
