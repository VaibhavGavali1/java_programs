//WAP to print values from n to 1. 

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        n = sc.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }
}
