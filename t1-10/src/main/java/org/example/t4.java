package org.example;

public class t4
{
    static int[] t4met(int[][] x) {
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
        return null;
    }
}
