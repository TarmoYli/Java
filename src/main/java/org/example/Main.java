package org.example;

import java.util.Arrays;
import java.util.Locale;

import static java.lang.Math.sqrt;
import static java.lang.Math.toIntExact;

public class Main {
    public static void main(String[] args) {
// T1.
        int[] x = {0, 0};
        int[] y = {0, 3};
        System.out.println(t1(x, y));

// T2.
        t2(5);

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
        return null;    // lonkalta tämmönen tänne jos loopit kusahtaa.
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
}