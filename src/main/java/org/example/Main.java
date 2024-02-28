package org.example;

import java.util.Arrays;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

    int[] x = {0,0};
    int[] y = {0,3};
    System.out.println(t1(x,y));

    t2(5);

    System.out.println(Geometria.circle(3.5));
    System.out.println(Geometria.rectangle(3,5));
    System.out.println(Geometria.square(4));

    int[][] matrix = {
            {1, 5, 7},
            {9, 3, 1},
            {0, 1, 1}
    };
    System.out.println(Arrays.toString(t4(matrix)));

    }


    static double t1 (int[] x,int[] y){
        double p1 = x[0]-x[1];
        double p2 = y[0]-y[1];
        return sqrt(p1*p1 + p2*p2);
    }
    static void t2(int x){
        for (int i = 0; i < x; i++) {
            for (int j = x-i; j > 1; j--) {
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
    static int[] t4(int[][] x){
        int a = 0;                                  // ensin etsitään max arvo
        for (int[] values : x) {
            for (int anInt : values) {
                if (anInt > a) {
                    a = anInt;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {        // sitten palautetaan max arvon indeksi
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] == a){
                    return new int[]{i,j};
                }

            }
        }
        return null;    // lonkalta tämmönen tänne jos loopit kusahtaa :p
    }

}
