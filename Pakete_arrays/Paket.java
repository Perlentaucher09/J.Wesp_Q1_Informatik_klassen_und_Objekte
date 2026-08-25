package Pakete_arrays;

class Paket {
    String sendungsNr;
    Double gewicht;
    String status;
    boolean express;
    

    Paket(String sendungsNr, Double gewicht, String status, boolean express){
        this.sendungsNr = sendungsNr;
        this.gewicht = gewicht;
        this.status = status;
        this.express = express;
    }
    public void anzeigen(){
        System.out.println("Sendungsnummer: " + sendungsNr);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Status: " + status);
        System.out.println("Express: " + express);
        System.out.println("Preis: " + berechnePreis());
    }
      public Double berechnePreis() {

    double preis = 0.0;

    if (express) {
        preis += 5.0; // Expresszuschlag
    }

    if (gewicht <= 2.0) {
      preis += 4.99;
    } else if (gewicht <= 5.0) {
      preis += 6.99;
    } else if (gewicht <= 10.0) {
      preis += 8.99;
    } else {
      preis += 12.99;
    }

    return Math.round(preis * 100.0) / 100.0; // Preis auf 2 Dezimalstellen runden
  }
}
