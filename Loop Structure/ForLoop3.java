//WAP to take two numbers into A and B & calculate A res to B

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {
        int a, b, i, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        for (i = 1; i <= b; i++) {
            c = c * a;

        }
        System.out.println(c);
    }
}
