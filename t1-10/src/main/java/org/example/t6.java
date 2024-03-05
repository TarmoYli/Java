package org.example;

public class t6
{
    static boolean t6met(String x) {
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
}
