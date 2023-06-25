//Calling based class constructor with argument.

class A {
    int i;

    A() {
        i = 10;
        System.out.println("Constructor without aegs");
    }



    A(int x) {
        i = x;
        System.out.println("Constructor with args");
    }
}

    class B extends A {
        int i;

        B() {
            super(100);
            i = 20;
            System.out.println("In B");
        }

        void add() {
            System.out.println(i + super.i);
        }
    }

public class CallingBConstwithArgs {
    public static void main(String[] args) {
        B ob=new B();
        ob.add();
    }
}
