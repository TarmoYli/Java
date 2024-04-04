package org.example;

import org.example.t14.Bank;
import org.example.t14.UserAccount;

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

    banker.createAccount(123,"Pekka",3210.12);        //luodaan uusi tili
    UserAccount pekanTili = banker.getAccountByNum(123);            //tehdään viittaus jotta päästään käyttämään tilin metodeja
    banker.addAccount(pekanTili);                                           //tili lisätään "järjestelmään"

    banker.createAccount(234,"Matti",1111.11);
    UserAccount matinTili = banker.getAccountByNum(234);
    banker.addAccount(matinTili);

    banker.printAccountByNumber(123);

    pekanTili.deposit(200.12);
    pekanTili.checkBalance();
    pekanTili.withdraw(1232.24);
    pekanTili.checkBalance();
    pekanTili.usePrint();

    banker.printAccountByNumber(123);
    banker.deleteAccount(123);
    */
    }
}
// muutin tuon nyt takaisin sellaiseksi että tili luodaan pankissa.
// deleteAccount() poistaa tilin "järjestelmästä"
// mutta tili(olio) jää vielä lillumaan viitteeseen sekä allAccounts listaan
// jos ne tarvisi myös poistuttaa niin deleteAccountsiin lisää poiston toisestakin listasta
// allAccounts on olemassa koska: "Luokalla tulee olla tieto olemassaolevista pankkitileistä."
// mutta lisäksi viite tarvisi asettaa tyyliin: "pekantili = null;"
// ajattelin että koittaisin rakennella tätä observer DPtä soveltaen, interfaceilla etc. Bank implements IObserver ja tilit implements IObservable.
// siinä olisi järki koska pankin olisi hyvä tietää (pitää kirjaa) kaikista tileillä tapahtuvista muutoksista (so. tässä tapauksessa nostoista ja talletuksista).
// mitä enemmän tätä tehtävää mietin sitä monimutkaisemmaksi tämä kasvaa. On vaikeaa lopettaa tämän tekemistä koska se ei minusta ole "valmis". :(