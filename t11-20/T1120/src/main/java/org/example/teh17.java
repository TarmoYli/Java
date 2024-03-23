package org.example;

public class teh17
{
    static String Stringverter(String ogString)
    {
        char[] invert = new char[ogString.length()];
        for (int i = 0; i < ogString.length(); i++)
        {
            invert[i] = ogString.charAt(ogString.length()-i-1);
        }
        return new String(invert);
    }
}

//- Tee algoritmi, joka kääntää merkkijonon toisinpäin.
//- Tehtävässä ei saa käyttää Javan sisäänrakennettuja mekanismeja kuten `StringBuilder`-objektin `reverse` metodia.
//- Metodi ottaa syötteenä `String`-tyyppisen muuttujan,
//  - muunna se `char[]` tyyppiseksi,
//  - käännä merkit
//  - ja lopuksi muunna `char[]` takaisin `String`-tyyppiseksi ja palauta se.

// mainiin:
// System.out.println(teh17.Stringverter("abcdefg"));