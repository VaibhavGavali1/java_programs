//Creating getter and setter using Classes and Object.

class student {
    private String fname;
    private String lname;
    private int year;
    private String branch;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

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

class GetterSetter {
    public static void main(String[] args) {
        student st1 = new student();

        st1.setFname("abc");
        st1.setLname("xyz");
        st1.setYear(2);
        st1.setBranch("BCS");

        System.out.println(st1.getFname());
        System.out.println(st1.getLname());
        System.out.println(st1.getYear());
        System.out.println(st1.getBranch());

        

        student st2 = new student();

        st2.setFname("Vaibhav");
        st2.setLname("Gavali");
        st2.setYear(2);
        st2.setBranch("BCS");

        System.out.println(st2.getFname());
        System.out.println(st2.getLname());
        System.out.println(st2.getYear());
        System.out.println(st2.getBranch());

    }
}
