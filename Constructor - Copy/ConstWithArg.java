//Construct with argument.

class Demo {
    int i;
    int j;

    Demo(int x, int y) {
        i = x;
        j = y;
        System.out.println("Constructor with argument called!");
    }

    void add() {
        System.out.println(i + j);
    }
}
 class ConstWithArg {
    public static void main(String[] args) {
        Demo ob1 = new Demo(10, 20);
        Demo ob2 = new Demo(30, 40);
        ob1.add();
        ob2.add();
    }
}
