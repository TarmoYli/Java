package org.example;
import java.util.Random;
public class teh12
{
    static String[] etunimet = {"eka","toka","koka","neka","vika","kuka","seka"};
    static String[] sukunimet = {"ekasuku","tokasuku","kokasuku","nekasuku","vikasuku","kukasuku","sekasuku"};

    static String makeName()
    {
        Random rng = new Random();
        return etunimet[rng.nextInt(7)] + " " + sukunimet[rng.nextInt(7)];
    }
}