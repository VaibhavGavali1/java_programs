//When the global and global variable always perference goes to local variable.

class Demo {
    int i;

    Demo(int i) {
        i = i;
    }

    void show() {
        System.out.println(i);
    }
}

 class GlobLoc1 {
    public static void main(String[] args) {
        Demo ob1 = new Demo(10);
        ob1.show();
    }
}
