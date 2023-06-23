//Creat a bank account details of customer using classes and object.

import java.util.Scanner;

class Account {
    int id;
    String name;
    int balance;
    Scanner sc = new Scanner(System.in);

    void creatAccount() {
        System.out.println("Enter id : ");
        id = sc.nextInt();
        System.out.println("Enter name : ");
        name = sc.next();
        System.out.println("Enter initial balance : ");
        balance = sc.nextInt();
    }

    void deposit() {
        System.out.println("Enter amount to Deposit ");
        int amt = sc.nextInt();
        balance = balance + amt;
    }

    void withdraw() {
        System.out.println("Enter amount to Withdraw ");
        int amt = sc.nextInt();
        balance = balance - amt;
    }

    void print() {
        System.out.println("*****************");
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("balance: " + balance);
    }
}

public class COAccount {
    public static void main(String[] args) {
        Account c1 = new Account();
        c1.creatAccount();
        Account c2 = new Account();
        c2.creatAccount();

        c2.deposit();
        c1.print();
        c2.print();

    }
}