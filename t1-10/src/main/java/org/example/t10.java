package org.example;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.Math.random;

public class t10
{
    static HashMap<String, ArrayList<Integer>> t10met(){

        HashMap<String, ArrayList<Integer>> dict = new HashMap<String, ArrayList<Integer>>();
        int min = -50;
        int max = 50;
        ArrayList<Integer> negintit = new ArrayList<Integer>();
        ArrayList<Integer> posintit = new ArrayList<Integer>();
        ArrayList<Integer> nolintit = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            int number = min + (int)(random()*((max-min)+1));
            if(number < 0){
                negintit.add(number);
            } else if (number > 0) {
                posintit.add(number);
            } else {
                nolintit.add(number);
            }
        }
        dict.put("Negative", negintit);
        dict.put("Positive", posintit);
        dict.put("Zero",nolintit);
        return dict;
    }
}
