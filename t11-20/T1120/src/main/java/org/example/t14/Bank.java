package org.example.t14;
import java.util.ArrayList;
public class Bank
{
    ArrayList<UserAccount> AllAccounts = new ArrayList<>();
    public void AddAccount(UserAccount account)
    {
        AllAccounts.add(account);
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
                System.out.printf("Account number: " + account.accountNumber+"%n"+
                        "Customer name: " + account.customerName+"%n"+
                        "Account balance: " + account.accountBalance+"€"+"%n");
            }
        }
    }
}


//  - Luokalla tulee olla tieto olemassaolevista pankkitileistä.
//  - Luokalla tulee olla metodit tilin lisäämiseen, poistamiseen
//  ja tietyn tilin tietojen tulostamiseen annetun tilinumeron perusteella.


//     public void PrintAccounts()
//    {
//        for (UserAccount account : AllAccounts) {
//            System.out.println(account.customerName + " " +
//                    account.accountNumber + " " +
//                    account.accountBalance);
//        }
//    }