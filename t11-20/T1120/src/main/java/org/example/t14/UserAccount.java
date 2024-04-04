package org.example.t14;

public class UserAccount {
    final int accountNumber;
    String customerName;
    double accountBalance;
    public UserAccount(int accNumber, String name, double balance)
    {
        this.accountNumber = accNumber;
        this.accountBalance = balance;
        this.customerName = name;
    }

    public void withdraw(double withdrawAmount)
    {
        this.accountBalance -= withdrawAmount;
    }

    public void deposit(double depositAmount)
    {
        this.accountBalance += depositAmount;
    }

    public void checkBalance()
    {
        System.out.println("Balance: " + this.accountBalance + "€");
    }
    public void usePrint()
    {
        this.printAllInfo();
    }
    protected void printAllInfo()
    {
        System.out.printf(
                "Name: " + this.customerName+"%n"+
                "Account #: " + this.accountNumber+"%n"+
                "Balance: " + this.accountBalance+"€" + "%n");
    }
}