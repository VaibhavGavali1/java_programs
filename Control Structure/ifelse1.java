//Program for if else to cast a vote.

import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You can cast a vote");
        } else {
            System.out.println("You can't cast a vote");
        }
    }
}
