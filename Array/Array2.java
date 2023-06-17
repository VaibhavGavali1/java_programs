//Write a 5 numbern into array and print any even number for that array

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array ");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array: ");
        for (i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[1]);
            }
        }
    }
}
