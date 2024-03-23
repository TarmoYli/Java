package org.example;

import org.example.t14.Bank;
import org.example.t14.UserAccount;

public class Main {
    public static void main(String[] args) {



        Bank pankki = new Bank();
        UserAccount account1 = new UserAccount(123,"Seppo",1414.23);
        UserAccount account2 = new UserAccount(456,"Martti",2342.23);
        pankki.AddAccount(account1);
        pankki.AddAccount(account2);
        account1.CheckBalance();
        account2.CheckBalance();
        account1.UsePrint();
    }
}
