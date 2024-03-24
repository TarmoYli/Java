package org.example.t18;

public enum FileType {
    TEXT,
    NOISE
}

abstract class FileTemplate{
    private final String path;
    private final FileType type;
    public FileTemplate(String path,FileType type)
    {
        this.path = path;
        this.type = type;
    }
    abstract void open();
    abstract void close();

    public String getPath(){return path;};
    public FileType getType(){return type;};
}

/* mainiin:
        TextFile teksti = new TextFile("C://tekstidata/", FileType.TEXT);
        NoiseFile soundi = new NoiseFile("D://noises/",FileType.NOISE);

        System.out.println(teksti.getPath()+ " " + teksti.getType());
        teksti.open();
        teksti.close();
        System.out.println(soundi.getPath()+ " " +soundi.getType());
        soundi.open();
        soundi.close();
 */