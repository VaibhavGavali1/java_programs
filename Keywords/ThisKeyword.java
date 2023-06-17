//Program for this Keyword.

class Demo {
    int i;

    Demo(int i) {
        this.i = 10;

    }

    void show() {
        System.out.println(i);
    }
}

class ThisKeyword {
    public static void main(String[] args) {
        Demo ob1 = new Demo(10);
        ob1.show();
    }
}
