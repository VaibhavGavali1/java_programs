//Overriding.

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


@Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
public String tostString(){
    return id+"  "+name;
}
}
public class Overriding {
    public static void main(String[] args) {
        Student st=new Student(100, "ABC");
        System.out.println(st.toString());
        System.out.println(st);
    }
}
