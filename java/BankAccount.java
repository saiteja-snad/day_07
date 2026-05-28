package day07part;

import java.util.*;

class Bank {

    int accountno;
    String name;
    double balance;

    Bank(int accountno, String name, double balance) {
        this.accountno = accountno;
        this.name = name;
        this.balance = balance;
    }

    Bank() {

    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Successfully deposited: " + amount);
        System.out.println("Available balance: " + balance);
    }

    public void withdraw(int amount) {

        if (balance >= amount) {
            balance = balance - amount;

            System.out.println("Successfully withdrawn: " + amount);
            System.out.println("Available balance: " + balance);
        }

        else {
            System.out.println("Insufficient balance...");
        }
    }

    public void checkbalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankAccount extends Bank {

    static Scanner sc = new Scanner(System.in);

    BankAccount(int accountno, String name, double balance) {
        super(accountno, name, balance);
    }

    void banking() {

        System.out.println("1.Deposit  2.Withdraw  3.Check Balance");

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("Enter deposit amount:");
            deposit(sc.nextInt());
        }

        else if (n == 2) {
            System.out.println("Enter withdraw amount:");
            withdraw(sc.nextInt());
        }

        else if (n == 3) {
            checkbalance();
        }

        else {
            System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter Account Number:");
        int acc = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Initial Balance:");
        double bal = sc.nextDouble();

        BankAccount c = new BankAccount(acc, name, bal);

        System.out.println("1 for Banking  2 Exit");

        int n = sc.nextInt();

        if (n == 1) {
            c.banking();
        }

        else {
            System.out.println("Bye...");
        }

        sc.close();
    }
}