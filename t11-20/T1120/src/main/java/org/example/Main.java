package org.example;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10,2,1,11,1,14,15};
        System.out.println(eka(arr));

        System.out.println(teh12.makeName());
    }
    static int eka(int[] arr)
    {
        int bigThree = 0;
        for (int i = 0; i < arr.length-2; i++)
        {
            int testThree = 0;
            int j = 0;
            while (j < 3)
            {
                testThree += arr[i+j];
                j++;
            }
            if(testThree > bigThree)
                bigThree = testThree;
        }
        return bigThree;
    }
}

