//Hybrid Enheritance.

class person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Student extends person{
    private int studid;

    public int getStudid() {
        return studid;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }
}
class teacher extends person{
    private float salary;
    private String subject;
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
class collegestudent extends Student{
    private int year;
    private String branch;
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
}
public class HybridEnheritance {
   public static void main(String[] args) {
    collegestudent ob=new collegestudent();
    ob.setStudid(5);
    ob.setName("Vaibhav");
    ob.setYear(2023);
    ob.setBranch("Communication");

    teacher ob1=new teacher();
    ob1.setSalary(50000.50f);
    ob1.setSubject("CS");


    System.out.println(ob.getStudid());
    System.out.println(ob.getName());
    System.out.println(ob.getYear());
    System.out.println(ob.getBranch());
    System.out.println(ob1.getSalary());
    System.out.println(ob1.getSubject());
   } 
}
