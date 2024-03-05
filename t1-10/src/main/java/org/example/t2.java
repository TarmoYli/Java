package org.example;

public class t2
{
    static void t2met(int x) {
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
}
