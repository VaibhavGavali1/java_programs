//Multiple constructor /Constructotr overloading.

import java.util.zip.DeflaterOutputStream;

class Demo {
    int i;
    int j;

    Demo(int x, int y) {
        i = x;
        j = y;
        System.out.println("Constructor with args called!");
    }

    Demo() {
        i = 10;
        j = 20;
        System.out.println("Constructor without args called!");
    }

    void add() {
        System.out.println(i + j);
    }
}

class MultipleConstructor {
    public static void main(String[] args) {
        Demo ob1 = new Demo();
        Demo ob2 = new Demo(30, 40);
        ob1.add();
        ;
        ob2.add();
    }
}
