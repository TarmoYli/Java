package org.example;

public class LonelyPlayer
{
    private static volatile LonelyPlayer instance; // volatile koska thread safety
    private String fileName;
    private LonelyPlayer(){}
    public static LonelyPlayer getInstance()
    {
        if(instance == null) // tupla tarkistus jotta ei mennä turhaan roikkumaan
        {
            synchronized (LonelyPlayer.class) // thread safe
            {
                if (instance == null)
                {
                    instance = new LonelyPlayer();
                }
            }
        }
        return instance;
    }
    public void setTrack(String fileName)
    {
        this.fileName = fileName;
    }
    public void playTrack()
    {
        System.out.printf("Playing track %s%n",this.fileName);
    }
}