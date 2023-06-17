//When the global and Local variable always perference goes to local variable.

class Demo {
    int i;

    Demo(int i) {
        i = 10;
    }

    void show() {
        System.out.println(i);
    }
}

class GVLV {
    public static void main(String[] args) {
        Demo ob1 = new Demo(10);
        ob1.show();
    }
}
