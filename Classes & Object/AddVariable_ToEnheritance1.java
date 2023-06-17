//Add Variablen to Enheritance.

class A {
    int i;

    A(A) {
        i = 10;
        System.out.println("In A");
    }


    class B extends A {
        int j;

        B() {
            j = 20;
            System.out.println("In B");
        }

    }

    void add() {
        System.out.println(i + j);
    }
}
class AddVariable_ToEnheritance1 {
    public static void main(String[] args) {
        B ob=new B();
        ob.add();
    }

}