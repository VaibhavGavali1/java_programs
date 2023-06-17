//Adding variable to the class.



class Demo{
    int i;
    int j;
    void setij(int x, int y){
        i=x;
        j=y;
    }
    void add(){
        System.out.println(i+j);
    }
}
class Adc{
    public static void main(String[]args) {
        Demo ob1=new Demo();
        ob1.setij(30,20);
        Demo ob2=new Demo();
        ob2.setij(80,80);
        ob1.add();
        ob2.add();
        
    }

}


