package 26kw38;

public class Artikel {
    private String bezeichnung;
    public Artikel(String bezeichnung) { this.bezeichnung = bezeichnung; }
}
public class Warenkorb {
    private Artikel[] artikel;
    //konstruktor
    public Warenkorb(int size) {
        this.artikel = new Artikel[size];
    }

    public void artikelHinzufuegen(Artikel a) {
        if (a == null) return;
        artikel = Arrays.copyOf(artikel, artikel.length + 1);
        artikel[artikel.length - 1] = a;
    }
}
public class Bestellung {
    private Artikel[] artikel;
    private Kunde kunde;

    public Bestellung(Artikel[] artikel) {
        this.artikel = artikel;
    }

    public Kunde getKunde() { return kunde; }
    public void setKunde(Kunde kunde) { this.kunde = kunde; }
}


public class Kunde {
    private String name;
    private Warenkorb warenkorb;                      
    private Bestellung[] bestellungen = new Bestellung[10];
    private String adresse;

    public Kunde(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
        this.warenkorb = new Warenkorb(10);              
    }

    public void bestellungAufgeben(Bestellung bestellung) {
        
        for (int i = 0; i < bestellungen.length; i++) {
            if (bestellungen[i] == null) {
                bestellungen[i] = bestellung;
                bestellung.setKunde(this); 
                break;
            }
        }                   
    }
}
