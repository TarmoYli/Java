package org.example.t20;

public class Task2 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Task 2 iteration: " +i );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}