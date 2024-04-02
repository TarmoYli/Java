package org.example.t18;

public class TextFile extends FileTemplate{

    public TextFile(String path, FileType type) {
        super (path, type);
    }
    @Override
    public void open() {
        System.out.printf("Opening %s file from %s %n", getType(), getPath());
    }

    @Override
    public void close() {
        System.out.printf("Closing %s file from %s %n", getType(),getPath());
    }
}
