package org.example;
import java.util.EmptyStackException;
public class Stack<T>
{
    private T[] stacker;
    private int top = -1;   // indikoi missä mennään, -1 koska indeksit.
    private int size;
    public Stack(int size){
        this.size = size;
        this.stacker = (T[]) new Object[size];          // tyyppimuunnos: objekti taulukko T-tyypin taulukoksi. :o
    }
    public void push(T data)
    {
        if(top + 1 == size)                             // jos esim rakennetaan stack jonka koko on 0, niin sinne ei pusketa mitään.
        {
            System.out.println("stack full");
        }
        else
        {
            top++;                                      // muutetaan Topin(Sorsakoski?) arvoa.
            stacker[top]=data;                          // eli top = -1 -> ++ -> eli [0] menee "data". seuraavassa puskussa top = 0 -> ++ -> [1]
        }
    }
    public T pop() throws EmptyStackException           // ei poista elementtiä vaan muuttaa/siirtää Sorsakoskea™
    {                                                   // jolloin arvo ylikirjoitetaan puskussa
        if(top == -1){
            throw new EmptyStackException();
        }
        else {
            T value = stacker[top];
            top--;                                      // Sorsakoski™ ottaa iskua :( muutoin homma ei toimi.
            return value;
        }
    }
    public int size()
    {
        return top+1;
    }
    public boolean isEmpty()
    {
        return top == -1;                               // jos Sorsakoski™ on negatiivinen, ollaan (kammottavien?) totuuksien äärellä.
    }
}
/* Mainiin:

        Stack<Integer> testStack = new Stack<Integer>(10);

        for (int i = 0; i < 10; i++)
        {
            testStack.push(i*i);
        }
        System.out.println(testStack.pop());
        testStack.push(123);
        System.out.println(testStack.isEmpty());
        System.out.println(testStack.size());

*/
