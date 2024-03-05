package org.example;

public class t7
{
    static int t7met(int x){
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
