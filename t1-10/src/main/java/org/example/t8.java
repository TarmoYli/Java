package org.example;

import java.util.ArrayList;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;

public class t8
{
    static ArrayList<Integer> t8met(int full){

        int half = round((float)full/2);
        ArrayList<Integer> forRet = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();        // apu lista johon laitetaan jäännökset
        for (int i = half; i < full; i++) {
            double root = sqrt(i);
            for (int j = 2; j < root; j++) {
                temp.add(i%j);
            }
            if (!temp.contains(0)){                         // nollaa ei löydy => on alkuluku
                forRet.add(i);
            }
            temp.clear();                                       // tarvii tyhjätä joka kierroksella.
        }
        return forRet;
    }
}
