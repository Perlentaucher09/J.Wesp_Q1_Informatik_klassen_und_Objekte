package Vielzuvieleaufgaben.26kw44;

public class PaketListe {

    private Knoten erster;

    public PaketListe() {
        erster = null;
    }

    public int anzahlPakete() {
        int c = 1;
        Knoten aktuell = erster;
        while(aktuell.getNächster !=null){
            c++;
            aktuell = aktuell.getNaechster();
        }
        return c
    }

    public double gesamtGewicht() {

        double g;
        Knoten aktuell = erster;
        while(aktuell != null){
            g = g + aktuell.getPaket().getGewicht;
            aktuell = aktuell.getNaechster();
        }
        return g;
    }

    public int zaehlePaketeNach(String zielort) {

        int c;
        Knoten aktuell = erster;
        while(aktuell != null){
            if(aktuell.getPaket().getZielort = zielort){
                c++
            }
            aktuell = aktuell.getNaechster();
        }
        return c;

    }

    public Paket suchePaket(String paketnummer) {
        Knoten aktuell = erster;
        while(aktuell != null){
            if(aktuell.getPaket().getPaketnummer = paketnummer){
                return aktuell;
            }
            aktuell = aktuell.getNaechster();
        }
        return null;
    }
}