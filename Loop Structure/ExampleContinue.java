//Example of continue statment.

import java.util.Scanner;

public class ExampleContinue {
    public static void main(String[] args) {
        int n, b;
        n = 123456;
        while (n > 0) {
            b = n % 10;
            System.out.println(b);
            n = n / 10;
        }
    }

}
