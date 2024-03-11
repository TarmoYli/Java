package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
// T1.
        int[] x = {0, 0};
        int[] y = {0, 3};
        t1.t1met(x,y);
// T2.
        t2.t2met(7);

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
        System.out.println(Arrays.toString(t4.t4met(matrix)));

// T5. (selection sort)
        int[] arr = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(t5.t5met(arr)));
// T6.
    System.out.println(t6.t6met("aivot avaavat ovia"));

// T7.
    System.out.println(t7.t7met(10));

// T8.
    System.out.println(t8.t8met(20));

// T9.
    System.out.println(t9.t9met(4777));

// t10.
        HashMap<String, ArrayList<Integer>> tuloste = t10.t10met();
        for (String i : tuloste.keySet()){
            System.out.println("Key: " + i + " Value: " + tuloste.get(i));
        }
    }
}

