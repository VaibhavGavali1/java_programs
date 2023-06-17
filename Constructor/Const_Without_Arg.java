//Construct ConstWith out Argument.

class Demo {
    int i;
    int j;

    Demo() {
        i = 10;
        j = 20;
        System.out.println("Construct without argument is called!");
    }

    void add() {
        System.out.println(i + j);
    }

}

public class Const_Without_Arg {
    public static void main(String[] args) {
        Demo ob1 = new Demo();
        Demo ob2 = new Demo();
        ob1.add();
        ob2.add();
    }
}
