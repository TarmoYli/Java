package org.example.t20;

public class Task1 implements Runnable
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Task 1 iteration: " +i );
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}