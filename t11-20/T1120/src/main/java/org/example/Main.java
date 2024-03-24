package org.example;

import org.example.t14.Bank;
import org.example.t14.UserAccount;
import org.example.t18.FileType;
import org.example.t18.NoiseFile;
import org.example.t18.TextFile;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TextFile teksti = new TextFile("C://tekstidata/", FileType.TEXT);
        NoiseFile soundi = new NoiseFile("D://noises/",FileType.NOISE);

        System.out.println(teksti.getPath()+ " " + teksti.getType());
        teksti.open();
        teksti.close();
        System.out.println(soundi.getPath()+" "+soundi.getType());
        soundi.open();
        soundi.close();
    }
}