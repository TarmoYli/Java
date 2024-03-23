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

/*      Mainiin:

        LonelyPlayer Player = LonelyPlayer.getInstance();
        Player.setTrack("Jorma Uotinen - 'Semisti hyvä'");
        Player.playTrack();
        LonelyPlayer Player2 = LonelyPlayer.getInstance();
        Player2.playTrack();                // todistelu alkaa tästä (tuloste on sama)
        if(Player == Player2){
            System.out.println("on se sama instanssi");
        }
        else{
            System.out.println("saveen meni");
        }                                   // todistelu päättyy tähän
*/