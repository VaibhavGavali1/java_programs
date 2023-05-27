//WAP to take a no. from user & print it's table.

import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        int i, n, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            b = n * i;
            System.out.println(b);
        }
    }
}
