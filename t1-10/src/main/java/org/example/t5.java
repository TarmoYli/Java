package org.example;

public class t5
{
    static int[] t5met(int[] x) {

        int[] ret = new int[x.length];          //uusi array vastaamaan alkuperäistä
        for (int i = 0; i < x.length; i++) {    //for herjaa että arraycopy() olisi pare...
            ret[i] = x[i];                      //...mut tällä mennään!
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
}
