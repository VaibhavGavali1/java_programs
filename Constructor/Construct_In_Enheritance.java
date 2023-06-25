//Constructor in Enheritance

class A {
    A() {
        System.out.println("In A");
    }
}

class B extends A {
    B() {
        System.out.println("In B");
    }
}

class C extends B {
    C() {
        System.out.println("In C");
    }
}

public class Construct_In_Enheritance {
    public static void main(String[] args) {
        C ob = new C();
    }
}
