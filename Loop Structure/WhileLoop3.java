//WAP to printy addition all no. between 1 to n.

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            sum = sum + i;
            System.out.println("Addition is " + sum);
        }
        i++;

    }
}
