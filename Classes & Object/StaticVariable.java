//Demo of Static variable .

class Demo {
    int i;
    static int j;

    Demo() {
        i++;
        j++;
    }

    void show() {
        System.out.println(i);
        System.out.println(j);
    }
}

class StatVariable {
    public static void main(String[] args) {
        Demo ob1 = new Demo();
        Demo ob2 = new Demo();
        Demo ob3 = new Demo();
        ob1.show();
        ob2.show();
        ob3.show();
    }
}
