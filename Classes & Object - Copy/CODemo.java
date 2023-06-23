//Demo program of classes and object.

import java.util.Scanner;

class Demo {
    void sayHello() {
        System.out.println("Hello World");
    }
}

public class CODemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.sayHello();
    }
}