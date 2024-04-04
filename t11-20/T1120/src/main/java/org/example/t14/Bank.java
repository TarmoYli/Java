package org.example.t14;
import java.util.ArrayList;
public class Bank
{
    ArrayList<UserAccount> allAccounts = new ArrayList<>();
    ArrayList<UserAccount> accountsInSystem = new ArrayList<>();
    public void addAccount(UserAccount account)
    {
        accountsInSystem.add(account);
    }
    public void createAccount(int accNum, String name, double balance)
    {
        UserAccount newAcc = new UserAccount(accNum,name,balance);
        allAccounts.add(newAcc);
        //tähän olisi voinut suoraan laittaa accountsInSystem.add(newAcc);
        //mutta jotenkin tämä:"Luokalla tulee olla metodit tilin lisäämiseen..." ei anna mun aivoille lupaa tehdä niin.
    }
    public void deleteAccount(int deleteNumber)
    {
        for(UserAccount account : accountsInSystem)
        {
            if(account.accountNumber == deleteNumber)
            {
                accountsInSystem.remove(account);
                return;
            }
        }
    }
    public UserAccount getAccountByNum(int accnum)
    {
        for(UserAccount acc : allAccounts)
        {
            if(acc.accountNumber == accnum)
            {
                return acc;
            }
        }
        return null;
    }
    public void printAccountByNumber(int accountNumber)
    {
        for(UserAccount account : accountsInSystem)
        {
            if (account.accountNumber == accountNumber)
            {
                System.out.printf(
                        "Account number: " + account.accountNumber+"%n"+
                        "Customer name: " + account.customerName+"%n"+
                        "Account balance: " + account.accountBalance+"€"+"%n");
            }
        }
    }
}