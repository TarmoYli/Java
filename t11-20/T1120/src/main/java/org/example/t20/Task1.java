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

/* Mainiin:
    Task1 eka = new Task1();
    Task2 toka = new Task2();
    Thread ekaThread = new Thread(eka);
    Thread tokaThread = new Thread(toka);
    ekaThread.start();
    tokaThread.start();
*/