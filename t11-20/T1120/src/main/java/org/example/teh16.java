package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class teh16
{
    static Random rng = new Random();
    static int puutos(ArrayList<Integer> sequence)
    {
        int originalSum = 0;
        for (int i = 0; i < sequence.size()-1; i++)
        {
            originalSum += sequence.get(i);
        }
        int moddedSum = 0;
        int rngIndex = rng.nextInt(sequence.size()-1);
        sequence.remove(rngIndex);
        for(int num : sequence){
            System.out.println(num);
        }
        for (int i = 0; i < sequence.size()-1; i++)
        {
            moddedSum += sequence.get(i);
        }
        return originalSum - moddedSum;
    }
}

/*  mainiin:
        ArrayList<Integer> luvut = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(teh16.puutos(luvut));
 */