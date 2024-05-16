package JAVA_OOPS.JAVA_OOPS_PILLARS.ABSTRACTION;
import java.util.Scanner;

 abstract class Bank{
    public String Name = "myBank";
    public String IFSC = "myBank123";

    public void bankDetail(){
        System.out.println("Bank Name:"+Name + " " + "Bank IFSC Code"+IFSC);
    }
    abstract void Deposit();
    abstract void Withdraw();
    abstract void checkBal();

}
class bankService extends Bank{
    private double bal = 5000;
    private int pwd;

    public void Deposit(double money) {
        System.out.println("Enter Password:");
        try (Scanner sc = new Scanner(System.in)) {
            pwd = sc.nextInt();
        }
        if (pwd == 123) {
            bal = bal + money;
            System.out.println("Deposited Money: " + money);
            System.out.println("Total balance: " + bal);
        } else {
            System.out.println("Incorrect Password.......");
        }
    }

    public void Withdraw(double money) {
        System.out.println("Enter Password:");
        try (Scanner sc = new Scanner(System.in)) {
            pwd = sc.nextInt();
        }
        if (pwd == 123) {
            if (money <= bal) {
                bal = bal - money;
                System.out.println("Withdrawn Money: " + money);
                System.out.println("Total balance: " + bal);
            } else {
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Incorrect Password.......");
        }
    }

    public void checkBal() {
        System.out.println("Enter Password:");
        try (Scanner sc = new Scanner(System.in)) {
            pwd = sc.nextInt();
        }
        if (pwd == 123) {
            System.out.println("Total balance: " + bal);
        } else {
            System.out.println("Incorrect Password.......");
        }
    }

    @Override
    void Deposit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Deposit'");
    }

    @Override
    void Withdraw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Withdraw'");
    }
}

public class ABSTRACTION{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            bankService b = new bankService();

            int ch;
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");

            System.out.println("Enter your choice:");
            ch = sc.nextInt();

            switch(ch){
                case 1: 
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    b.Deposit(depositAmount);
                    break;

                case 2: 
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = sc.nextDouble();
                    b.Withdraw(withdrawAmount);
                    break;

                case 3: 
                    b.checkBal();
                    break;

                default: 
                    System.out.println("Invalid Input");
            }
        }
    }  
}

