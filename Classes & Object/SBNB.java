//Use of Static block and normal block In a program .

class Demo {
    {
        System.out.println("Normal Block");
    }
    static {
        System.out.println("Static Block");
    }

    Demo() {
        System.out.println("In Constructor");
    }
}

class SBNB {
    public static void main(String[] args) {
        Demo ob1 = new Demo();
        Demo ob2 = new Demo();
        Demo ob3 = new Demo();
    }
}
