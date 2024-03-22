package org.example;

import org.example.t14.Bank;
import org.example.t14.UserAccount;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10,2,1,11,1,14,15};
//        System.out.println(eka(arr));
//        System.out.println(teh12.makeName());
        Bank pankki = new Bank();

        pankki.MakeNewAccount(12345,"Seppo",150);
        pankki.MakeNewAccount(123,"Maes",111);
        pankki.MakeNewAccount(12,"Hipalu",890.33);
        pankki.PrintAccounts();
        pankki.PrintAccountByNumber(12345);
        pankki.DeleteAccount(12345);
        pankki.PrintAccounts();
    }
    static int eka(int[] arr)
    {
        int bigThree = 0;
        for (int i = 0; i < arr.length-2; i++)
        {
            int testThree = 0;
            int j = 0;
            while (j < 3)
            {
                testThree += arr[i+j];
                j++;
            }
            if(testThree > bigThree)
                bigThree = testThree;
        }
        return bigThree;
    }
}

//        teh13:
//        File file1 = new File("C://data/");
//        long totalSize = teh13.FolderSize(file1);
//        System.out.printf(
//                "Hakemiston ja alihakemistojen koko: %.1f Megatavua eli %d tavua",
//                (double)totalSize/(1024*1024), totalSize);