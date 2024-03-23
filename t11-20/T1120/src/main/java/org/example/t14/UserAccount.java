package org.example.t14;

public class UserAccount
{
    final int accountNumber;
    String customerName;
    double accountBalance;
    public UserAccount(int accNumber, String name, double balance)
    {
        this.accountNumber = accNumber;
        this.accountBalance = balance;
        this.customerName = name;
    }

    public void Withdraw(double withdrawAmount)
    {
        this.accountBalance -= withdrawAmount;
    }

    public void Deposit(double depositAmount)
    {
        this.accountBalance += depositAmount;
    }

    public void CheckBalance()
    {
        System.out.println("Balance: " + this.accountBalance + "€");
    }
    public void UsePrint()
    {
        this.PrintAllInfo();
    }
    protected void PrintAllInfo()
    {
        System.out.printf(
                "Name: " + this.customerName+"%n"+
                "Account #: " + this.accountNumber+"%n"+
                "Balance: " + this.accountBalance+"€");
    }
}


// - Tee luokka, joka kuvaa käyttäjän pankkitiliä.
// - Luokassa tulee olla tieto pankkitilin numerosta, omistajan nimestä ja saldosta.
// - Pankkitilin numeron tulee olla muuttumaton,
//   sen tyyppi voi olla valintasi mukaan `String` tai `int` tai jokin muu mielestäsi sopiva tyyppi.
// - Luokalla tulee olla metodit nostamiseen, tallettamiseen ja saldon tulostamiseen.
// - Lisäksi luokalla tulee olla protected metodi, joka tulostaa tilin kaikki tiedot.