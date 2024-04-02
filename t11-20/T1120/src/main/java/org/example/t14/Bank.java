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

/*
tässä oli tehtäväanto sellainen että ratkaisin asian näin. Ymmärrän kyllä että tehtävänannon saaminen sellaiseksi,
että siinä ei ole tulkinnanvaraa on haastavaa eikä ehkä edes kovin oleellista ja/tai järkevää ajankäyttöä.
"Luokalla tulee olla tieto olemassaolevista pankkitileistä."
    tämä toteutuu kun suoritetaan AddAccount(), mutta jos se ei ole se mitä haettiin,
    niin ratkaisisin sen niin että tekisin uuden listan joka saa ilmoituksen/lisäyksen UserAccount rakentajalta (tilinro)
    jolloin luokalla olisi aina tieto uuden tilin luomisesta vaikka sitä ei lisättäisi addAccountilla.
Pyydetyt metodit kuitenkin löytyvät kummastakin luokasta, ja ne toimivat odotetusti(?).
Hyväksyn kyllä jos piste vähennetään jos/kun tehtävänantoa ei ole noudatettu oikein.
 */