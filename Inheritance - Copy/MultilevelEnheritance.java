//Multilevel Enheritance

class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class mark extends Student {
    private int m1;

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    private int m2;
}

class result extends mark {
    void calculateAvg() {
        float avg = (getM1() + getM2()) / 2;
        System.out.println("Average is" + avg);
    }
}

public class MultilevelEnheritance {
    public static void main(String[] args) {
        result ob = new result();
        ob.setId(1);
        ob.setName("abc");
        ob.setM1(80);
        ob.setM2(90);

        System.out.println(ob.getId());
        System.out.println(ob.getName());
        System.out.println(ob.getM1());
        System.out.println(ob.getM2());
        ob.calculateAvg();
    }
}