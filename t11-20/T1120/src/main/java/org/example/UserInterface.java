package org.example;
import org.example.t18.FileType;
import org.example.t18.NoiseFile;
import org.example.t18.TextFile;
import org.example.t20.Task1;
import org.example.t20.Task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    Scanner reader = new Scanner(System.in);
    public char printMenu()
    {
        System.out.println("a. tehtävä 11.(suurimmat kolme arraystä)");
        System.out.println("b. tehtävä 12.(random nimi generaattori)");
        System.out.println("c. tehtävä 13.(hakemistojen koko)");
        System.out.println("d. tehtävä 14.(pankki juttu)");
        System.out.println("e. tehtävä 15.(singleton)");
        System.out.println("f. tehtävä 16.(puuttuva luku)");
        System.out.println("g. tehtävä 17.(stringin kääntäjä)");
        System.out.println("h. tehtävä 18.(enum/abstrakti/perintä härpäke)");
        System.out.println("i. tehtävä 19.(stack)");
        System.out.println("j. tehtävä 20.(thread)");
        System.out.println("0. lopeta.");
        return reader.next().charAt(0);
    }
    public void applySelection(char selection)
    {
        switch(selection)
        {
            case 'a':
                int[] arr = {10,2,1,11,1,14,15};
                System.out.println(teh11.eka(arr));
                break;
            case 'b':
                System.out.println(teh12.makeName());
                break;
            case 'c':
                File file1 = new File("C://data/");
                long totalSize = teh13.FolderSize(file1);
                System.out.printf(
                        "Hakemiston ja alihakemistojen koko: %.1f Megatavua eli %d tavua %n",
                        (double)totalSize/(1024*1024), totalSize);
                break;
            case 'd':
                System.out.println("tätä joutunet testaamaan mainissa manuaalisesti.");
                System.out.println("koska en jaksa alkaa väsäämään sille tällaista omaa menu härpäkettä");
                System.out.println("Siellä (mainissa) kyllä lymyää juttuja valmiina (kommentoituna).");
                break;
            case 'e':
                LonelyPlayer Player = LonelyPlayer.getInstance();
                Player.setTrack("Steve Vai & Joe Satriani - 'The Sea of Emotion Pt.1'");
                Player.playTrack();
                LonelyPlayer Player2 = LonelyPlayer.getInstance();
                Player2.playTrack();
                if(Player == Player2){
                    System.out.println("on se sama instanssi");
                }
                else{
                    System.out.println("saveen meni");
                }
                break;
            case 'f':
                ArrayList<Integer> luvut = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
                System.out.println(teh16.puutos(luvut));
                break;
            case 'g':
                System.out.println(teh17.Stringverter("abcdefg"));
                break;
            case 'h':
                TextFile teksti = new TextFile("C://tekstidata/", FileType.TEXT);
                NoiseFile soundi = new NoiseFile("D://noises/", FileType.NOISE);
                System.out.println(teksti.getPath()+ " " + teksti.getType());
                teksti.open();
                teksti.close();
                System.out.println(soundi.getPath()+ " " +soundi.getType());
                soundi.open();
                soundi.close();
                break;
            case 'i':
                Stack<Integer> testStack = new Stack<Integer>(10);

                for (int i = 0; i < 10; i++)
                {
                    testStack.push(i*i);
                }
                System.out.println(testStack.pop());
                testStack.push(123);
                System.out.println(testStack.isEmpty());
                System.out.println(testStack.size());
                break;
            case 'j':
                Task1 eka = new Task1();
                Task2 toka = new Task2();
                Thread ekaThread = new Thread(eka);
                Thread tokaThread = new Thread(toka);
                ekaThread.start();
                tokaThread.start();
                try                                 // tämän superhäävin menun takia joinataan nämä
                {
                    ekaThread.join();
                    tokaThread.join();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace(); //jtn ruikutusta ettei ole paras tapa mutta tässä kyllä riittää.
                }
                break;
        }
    }
}