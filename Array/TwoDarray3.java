//Write a program for matrix addition.

import java.util.Scanner;

public class TwoDarray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];
        int i, j;
        System.out.println("Enter First Array: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter Second Array: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();

            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        System.out.println("Matrix addition is : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(" " + arr3[i][j]);
            }
            System.out.println();
        }
    }
}
