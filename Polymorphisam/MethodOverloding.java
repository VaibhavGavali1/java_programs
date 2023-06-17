//Metohd Overloading.

class Demo {
    void add(int x, int y) {
        System.out.println("Int add function called");
        System.out.println(x + y);
    }

    void add(Float x, Float y) {
        System.out.println("Float add function called");
        System.out.println(x + y);
    }
}

public class MethOverloding {
    public static void main(String[] args) {
        Demo ob = new Demo();
        ob.add(1.2, 2.3);
        ob.add(100f, 200f);
    }
}
