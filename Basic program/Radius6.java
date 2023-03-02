import java.util.Scanner;
public class Radius6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,r;
        System.out.println("Enter radius of Circle");
        r=sc.nextDouble();
        a=3.14*r*r;
        System.out.println("Area of Circle is "+a);

    }
}
