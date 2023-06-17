//Sample array program.

import java.util.Scanner;

public class DemoArray1 {

    public static void main(String ar[]) {
        int i;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter array");
        for (i = 0; i < 5; i++) {
            array[i] = sc.nextInt();

        }
        System.out.println("Your array:");
        for (i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }
}