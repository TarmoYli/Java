package org.example.t14;

public class UserAccount
{
    final int accountNumber;
    String customerName;
    double accountBalance;
    public UserAccount(int accNumber, String custName, double balance)
    {
        this.accountNumber = accNumber;
        this.accountBalance = balance;
        this.customerName = custName;
    }

    public void Withdraw(int withdrawAmount)
    {
        this.accountBalance -= withdrawAmount;
    }

    public void Deposit(int depositAmount)
    {
        this.accountBalance += depositAmount;
    }

    public double CheckBalance()
    {
        return this.accountBalance;
    }

    protected void PrintAllInfo()
    {
        System.out.printf(
                "Name: " + this.customerName+"%n"+
                "Account #: " + this.accountNumber+"%n"+
                "Balance: " + this.accountBalance);
    }

}


// - Tee luokka, joka kuvaa käyttäjän pankkitiliä.
// - Luokassa tulee olla tieto pankkitilin numerosta, omistajan nimestä ja saldosta.
// - Pankkitilin numeron tulee olla muuttumaton,
// sen tyyppi voi olla valintasi mukaan `String` tai `int` tai jokin muu mielestäsi sopiva tyyppi.
// - Luokalla tulee olla metodit nostamiseen, tallettamiseen ja saldon tulostamiseen.
// - Lisäksi luokalla tulee olla protected metodi, joka tulostaa tilin kaikki tiedot.