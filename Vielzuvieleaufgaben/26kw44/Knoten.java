package Vielzuvieleaufgaben.26kw44;
public class Knoten {

    private String paket;
    private Knoten naechster;

    public Knoten(String paket) {
        this.paket = paket;
        this.naechster = null;
    }

    public String getPaket() {
        return paket;
    }

    public Knoten getNaechster() {
        return naechster;
    }

    public void setNaechster(Knoten naechster) {
        this.naechster = naechster;
    }
}