//Enheritance  : Creating of enheritance.

class A {
    void show() {
        System.out.println("In A");
    }
}

class B extends A {
    void disp() {
        System.out.println("In B");
    }
}

class Enheritance {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
        ob.disp();
    }
}
