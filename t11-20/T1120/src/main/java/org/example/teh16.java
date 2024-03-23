package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class teh16
{
    static Random rng = new Random();
    static int puutos(ArrayList<Integer> sequence)
    {
        int originalSum = 0;
        for (int i = 0; i < sequence.size()-1; i++)
        {
            originalSum += sequence.get(i);
        }
        int moddedSum = 0;
        int rngIndex = rng.nextInt(sequence.size()-1);
        sequence.remove(rngIndex);
        for(int num : sequence){
            System.out.println(num);
        }
        for (int i = 0; i < sequence.size()-1; i++)
        {
            moddedSum += sequence.get(i);
        }
        return originalSum - moddedSum;
    }
}

//- Tee algoritmi, joka etsii kokonaislukujen joukosta puuttuvan luvun ja palauttaa sen.
//- Tehtävän rajoituksena on, että joukko alkaa aina luvusta 1 ja päättyy johonkin kokonaislukuun n.
//  - Tästä joukosta poistetaan satunnaisesti jokin luku.
//- Paluutyyppi on `int`
//- Esimerkiksi
//  - `{1, 2, 3, 5}` joukosta puuttuu 4
//  - `{1, 2, 3, 4, 5, 6, 8, 9, 10, 11}` joukosta puuttuu 7