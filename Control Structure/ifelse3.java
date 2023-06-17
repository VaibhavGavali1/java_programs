//WAP to print maximum no. using if else.

import java.util.Scanner;

public class ifelse3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a > b) {
            System.out.println("A is max");
        } else {
            System.out.println("B is max");
        }
    }
}
