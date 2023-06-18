//Use of Break Statment.

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
