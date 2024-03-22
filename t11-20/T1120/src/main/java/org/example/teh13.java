package org.example;
import java.io.File;
public class teh13
{
    public static long FolderSize(File folder)
    {
        long totalSize = 0;

        File[] filesInFolder = folder.listFiles();

        int fileCount = filesInFolder.length;

        for (int i = 0; i < fileCount; i++) {
            if(filesInFolder[i].isFile())
            {
                totalSize += filesInFolder[i].length();
            }
            else
            {
                totalSize += FolderSize(filesInFolder[i]);
            }
        }

        return totalSize;
    }

}

// - Tee algoritmi, joka laskee annetun hakemiston ja sen alihakemistojen tiedostojen koon.
// - Hakemiston polkua ei tarvitse lukea käyttäjän syötteestä,
//   kunhan se toimii syötteenä metodille.
// - Syötteen tyyppi on `File` joka löytyy paketista `java.io.File`
// - Paluutyyppi on `long`