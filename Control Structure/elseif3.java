//WAP to print the salary of employe using the else if condition.

import java.util.Scanner;

public class elseif3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary, hra, da, total;
        System.out.println("Enter salary");
        salary = sc.nextDouble();

        if (salary <= 10000) {
            hra = salary * 0.2;
            da = salary * 0.8;
            total = salary + hra + da;
        } else if (salary <= 20000) {
            hra = salary * 0.25;
            da = salary * 0.9;
            total = salary + hra + da;
        } else {
            hra = salary * 0.3;
            da = salary * 0.9;
            total = salary + hra + da;
        }
        System.out.println("Total salary is " + total);
    }
}
