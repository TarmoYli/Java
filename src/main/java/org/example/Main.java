package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
// T1.
        int[] x = {0, 0};
        int[] y = {0, 3};
        System.out.println(t1(x, y));

// T2.
        t2(7);

// T3.
        System.out.println(Geometria.circle(3.5));
        System.out.println(Geometria.rectangle(3, 5));
        System.out.println(Geometria.square(4));

// T4.
        int[][] matrix = {
                {1, 5, 7},
                {9, 3, 1},
                {0, 1, 1}
        };
        System.out.println(Arrays.toString(t4(matrix)));

//T5. (selection sort)
        int[] arr = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(t5(arr)));
        System.out.println(Arrays.toString(arr));

// T6.
    System.out.println(t6("aivot avaavat ovia"));

// T7.
    System.out.println(t7(10));

// T8.
    System.out.println(t8(20));

// T9.
    System.out.println(t9(4777));

// t10.
        HashMap<String, ArrayList<Integer>> ulostus = t10();
        for (String i : ulostus.keySet()){
            System.out.println("Key: " + i + " Value: " + ulostus.get(i));
        }
    }




    static double t1(int[] x, int[] y) {
        double p1 = x[0] - x[1];
        double p2 = y[0] - y[1];
        return sqrt(p1 * p1 + p2 * p2);
    }

    static void t2(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int[] t4(int[][] x) {
        int a = 0;                                  // etsitään max arvo
        for (int[] rows : x) {
            for (int value : rows) {
                if (value > a) {
                    a = value;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {        // etsitään ja palautetaan max arvon indeksi
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] == a) {
                    return new int[]{i, j};
                }

            }
        }
        return null;    // lonkalta tämmönen tänne jos joku kusahtaa.
    }

    static int[] t5(int[] x) {

        int[] ret = new int[x.length];          //uusi array vastaamaan alkuperäistä
        for (int i = 0; i < x.length; i++) {    //for herjaa että arraycopy() olisi pare...
            ret[i] = x[i];                      //...mut tällä mennään satanas!
        }                                       //se KUITENKIN tekee jtn samanlaista. väkisinkin.

        for (int i = 0; i < ret.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < ret.length; j++) {
                if (ret[min] > ret[j]) {
                    min = j;
                }
            }
            int temp = ret[i];
            ret[i] = ret[min];
            ret[min] = temp;
        }
        return ret;
    }

    static boolean t6(String x) {
        int i = 0;
        String temp = x.toLowerCase();
        temp = temp.replace(" ","");
        int j = temp.length()-1;
        char[] tempA = temp.toCharArray();

        while (i<j) {
            if(tempA[i] != tempA[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static int t7(int x){
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < x-1; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    static ArrayList<Integer> t8(int full){

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
    static String t9(int x){

        String secs = String.valueOf(x%60);
        String mins = String.valueOf(x/60%60);
        String hrs = String.valueOf(x/60/60);
        if(hrs.length() == 1){                          // nämä iffit on meh...
            hrs = "0"+hrs;
        }
        if(mins.length() == 1){                         // voisi kuvitella tämän hoituvan jotenkin paremminkin
            mins = "0"+mins;
        }
        if(secs.length() == 1){                         // mutta kun aikaa on rajallisesti tähän käytettävissä niin tällä mennään.
            secs = "0"+secs;
        }
        String total = hrs + ":" + mins + ":" + secs;

        return total;
    }
    static HashMap<String, ArrayList<Integer>> t10(){

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