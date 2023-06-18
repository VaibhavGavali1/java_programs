//Use of Do wile loop.

import java.util.Scanner;

public class DowhileLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String choice;
        do {
            System.out.println("Enter 2 numbers ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a + b;
            System.out.println("Addition is " + c);
            System.out.println("Do you want to continue?(Yes/No)");
            choice = sc.next();

        } while (choice.equals("Yes"));
    }
}
