package org.example;
import static java.lang.Math.*;
public class t1 {
    public static double t1met(int[] x, int[] y) {
        double p1 = x[0] - x[1];
        double p2 = y[0] - y[1];
        return sqrt(p1 * p1 + p2 * p2);
    }
}
