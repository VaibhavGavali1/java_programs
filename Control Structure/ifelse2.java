//Program for even or odd using if else.

import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter number ");
        a = sc.nextInt();
        b = a % 2;
        if (b == 0) {
            System.out.println("Even");
        } else {
            System.err.println("Odd");
        }

    }
}
