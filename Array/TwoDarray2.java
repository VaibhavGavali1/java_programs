//Example 2 of 2D array.

import java.util.Scanner;

public class TwoDarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter Character");
        ch = sc.next().charAt(0);
        int x;
        x = ch;
        if (x >= 65 && x <= 90) {
            System.out.println("Capital");
        } else if (x >= 97 && x <= 122) {
            System.out.println("Small");
        } else if (x >= 48 && x <= 97) {
            System.out.println("Digital");
        }
    }
}
