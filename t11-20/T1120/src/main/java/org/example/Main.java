package org.example;

import org.example.t14.Bank;
import org.example.t14.UserAccount;
import org.example.t18.FileType;
import org.example.t18.NoiseFile;
import org.example.t18.TextFile;
import org.example.t20.Task1;
import org.example.t20.Task2;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        UserInterface user = new UserInterface();
        boolean isRunning = true;
        while(isRunning)
        {
            char select = user.printMenu();
            if (select != '0')
            {
                user.applySelection(select);
            }
            else
            {
                isRunning = false;
            }
        }
//  Pankki tehtävä:
/*
        Bank banker = new Bank();
        UserAccount pekantili = new UserAccount(123456,"Pekka Poro",1500);
        UserAccount matintili = new UserAccount(654321,"Matti Mato",2000);
        banker.AddAccount(pekantili);
        banker.AddAccount(matintili);
        banker.PrintAccountByNumber(123456);
        banker.DeleteAccount(123456);
        matintili.UsePrint();
        matintili.CheckBalance();
        matintili.Withdraw(200);
        matintili.CheckBalance();
        matintili.Deposit(982.21);
        matintili.CheckBalance();
        banker.DeleteAccount(654321);

*/
    }
}

