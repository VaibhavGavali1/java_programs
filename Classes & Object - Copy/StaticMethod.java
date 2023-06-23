//Static methods demo program.

class Demo {
    int i;
    static int j;

    Demo() {
        i++;
        j++;
    }

    static void disp() {
        System.out.println("Hello");
    }

    static void show() {
        System.out.println(j);
        disp();
    }
}

class StaticMethod {
    public static void main(String[] args) {
        Demo ob1 = new Demo();
        Demo ob2 = new Demo();
        Demo ob3 = new Demo();
        Demo.show();
    }
}
