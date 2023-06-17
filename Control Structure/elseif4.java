//WAP to find out positive , negative or zero numbers form the given no. using else if condition.

import java.util.Scanner;

public class elseif4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a = sc.nextInt();
        if (a > 0) {
            System.out.println("positive numbers");
        } else if (a < 0) {
            System.out.println("Negavtive numbers");
        } else {
            System.out.println("Zero");
        }
    }
}
