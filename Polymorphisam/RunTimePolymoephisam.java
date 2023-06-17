//Run Time Polymorphisam.

class A1 {
    void read() {
        System.out.println("Read from file");
    }
}

class B1 extends A1 {
    void read() {
        System.out.println("Read from USB drive");
    }
}

class C1 extends B1 {

    @Override
    void read() {
        // TODO Auto-generated method stub
        super.read();
    }
  
}

public class RunTimePolymoephisam {
    static void show(A1 r) {
        r.read();
    }

    public static void main(String[] args) {
        A1 ob1 = new A1();
        B1 ob2 = new B1();
        C1 ob3 = new C1();
        show(ob1);
        show(ob2);
        show(ob3);
    }
}
