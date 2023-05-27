//WAP to take a no. from user and print it's factorial value.

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        int i, n, sum = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        for (i = 1; i <= 10; i++) {
            sum = sum * 1;
        }
        System.out.println("Factorial is " + sum);
    }
}
