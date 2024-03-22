package org.example.t14;
import java.util.ArrayList;
public class Bank
{
    int accountNumber;
    String customerName;
    double accountBalance;
    ArrayList<UserAccount> AllAccounts = new ArrayList<>();
    public void MakeNewAccount(int accountNumber, String clientName, double balance)
    {
        UserAccount account = new UserAccount(accountNumber,clientName,balance);
        AllAccounts.add(account);
    }
    public void PrintAccounts()
    {
        for (UserAccount account : AllAccounts) {
            System.out.println(account.customerName);
        }
    }
    public void DeleteAccount(int deleteNumber)
    {
        for(UserAccount account : AllAccounts)
        {
            if(account.accountNumber == deleteNumber)
            {
                AllAccounts.remove(account);
                return;
            }
        }
    }
    public void PrintAccountByNumber(int accountNumber)
    {
        for(UserAccount account : AllAccounts)
        {
            if (account.accountNumber == accountNumber)
            {
                System.out.printf("Account: " + account.accountNumber+"%n"+
                        "Customer: " + account.customerName+"%n"+
                        "Balance: " + account.accountBalance+"%n");
            }
        }
    }
}


//  - Luokalla tulee olla tieto olemassaolevista pankkitileistä.
//  - Luokalla tulee olla metodit tilin lisäämiseen, poistamiseen
//  ja tietyn tilin tietojen tulostamiseen annetun tilinumeron perusteella.