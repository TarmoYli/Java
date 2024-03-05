package org.example;

public class t9
{
    static String t9met(int x){

        String secs = String.valueOf(x%60);
        String mins = String.valueOf(x/60%60);
        String hrs = String.valueOf(x/60/60);
        if(hrs.length() == 1){                          // nämä iffit on meh...
            hrs = "0"+hrs;
        }
        if(mins.length() == 1){                         // voisi kuvitella tämän hoituvan jotenkin paremminkin
            mins = "0"+mins;
        }
        if(secs.length() == 1){                         // mutta kun aikaa on rajallisesti tähän käytettävissä niin tällä mennään.
            secs = "0"+secs;
        }
        String total = hrs + ":" + mins + ":" + secs;

        return total;
    }
}
