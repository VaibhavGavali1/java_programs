//WAP to take a number from user into n & print all the number between 1 to n.

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
