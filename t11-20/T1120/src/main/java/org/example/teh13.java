package org.example;
import java.io.File;
public class teh13
{
    public static long FolderSize(File folder)
    {
        long totalSize = 0;
        File[] filesInFolder = folder.listFiles();
        int fileCount = 0;

        if (filesInFolder != null) {
            fileCount = filesInFolder.length;
        }
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

//        File file1 = new File("C://data/");
//        long totalSize = teh13.FolderSize(file1);
//        System.out.printf(
//                "Hakemiston ja alihakemistojen koko: %.1f Megatavua eli %d tavua",
//                (double)totalSize/(1024*1024), totalSize);