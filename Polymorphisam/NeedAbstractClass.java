//Need of abstract class.

abstract class Account {
    void getCustInfo() {
        System.out.println("Get cuts info....");
    }

    abstract void calculatrIntrst();

}

class Saving extends Account {
    @Override
    void calculatrIntrst() {
        System.out.println("Calculate intrst of saving");
    }

}

class Loan extends Account {
    @Override
    void calculatrIntrst() {
        System.out.println("Calculate intrest of Loan");
    }
}

public class NeedAbstractClass {
    public static void main(String[] args) {
        Saving ob1 = new Saving();
        ob1.getCustInfo();
        ob1.calculatrIntrst();

        Loan ob2 = new Loan();
        ob2.getCustInfo();
        ob2.calculatrIntrst();
    }
}
