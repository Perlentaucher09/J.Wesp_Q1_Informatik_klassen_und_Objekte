package 26kw38;

public class Bibliothek {
    private String name;
    private Buch[] buecher;

    public Bibliothek(String name, int anzahlBuecher) {
        this.name = name;
        this.buecher = new Buch[anzahlBuecher];
    }

    public void ausleihen() { 
    }

    public void buchHinzufuegen(Buch buch) {
        for (int i = 0; i < buecher.length; i++) {
            if (buecher[i] == null) {
                buecher[i] = buch;
                break;
            }
        }
    }
}

