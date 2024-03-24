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

/*
- Luo molemmille tiedostotyypeille luokka, joka perii aiemmin luodun abstraktin luokan
  - Tänne tarvitset konstruktorin, joka kutsuu yliluokan konstruktoria
  - Molemmille luokille omat implementaatiot avaamis- ja sulkemismetodeista
  - Riittää, että implementoinneissa esimerkiksi tulostetaan
  "Opening audio file..." ja "Closing text file..."
*/