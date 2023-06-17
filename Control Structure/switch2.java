//WAP to create a simple calculater using switch case statment.

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        int x, y, z;
        System.out.println("Enter your choice(+,-,*,/):");
        choice = sc.next();
        System.out.println("Enter two numbers");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        switch (choice) {

            case "+":
                z = x + y;
                System.out.println("Addition is " + z);
                break;

            case "-":
                z = x - y;
                System.err.println("Substraction is " + z);
                break;

            case "*":
                z = x * y;
                System.out.println("Multiplication is " + z);
                break;

            case "/":
                System.out.println("Division is " + z);
                break;

            default:
                System.out.println("Wrong choice");

        }
    }
}
