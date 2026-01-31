package gr.aueb.cf.cf9.ch14_Inheritance.myaccount;

public class Account {

    private double balance;

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(double balance){
        this.balance = balance;
    };

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw (double amount){
        balance -= amount;
}




}
