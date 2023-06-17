//WAP using swithc case statment.

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("Enter 1, 2 or 3");
        x=sc.nextInt();
        switch(x){ 
        case 1:
        System.out.println("One");
        break;


        case 2:
        System.out.println("Two");
        break;

        case 3:
        System.out.println("Three");
        break;

        default:
        System.out.println("Wrong choise");
        }
    }
}
