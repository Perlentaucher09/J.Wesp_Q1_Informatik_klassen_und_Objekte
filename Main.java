class Utility{
  public static void trennung(){
    System.out.println("--------------------------------------------------");
  }
}


public class Main {
    public static void main(String[] args) {
      Paket p1 = new Paket("P1007", 5.0, "im Zustellfahrzeug", false);
      Paket p2 = new Paket("P1008", 25.0, "in zustellung", true);

      Utility.trennung();
      p1.anzeigen();
      System.out.println("Preis p1: " + p1.berechnePreis() + " €");
      Utility.trennung();
      p2.anzeigen();
      System.out.println("Preis p2: " + p2.berechnePreis() + " €");
      Utility.trennung();
      p1.status_aendern("zugestellt");
      Utility.trennung();
    }
}


class Paket{
  private String sendungsnummer;
  private Double gewicht;
  private String status;
  private boolean express;

  //Konstruktor

  public Paket(String sendungsNr, Double gewicht, String status, boolean express){
    this.sendungsnummer = sendungsNr;
    this.gewicht = gewicht;
    this.status = status;
    this.express = express;
  }

  public void status_aendern(String neuerStatus){
    this.status = neuerStatus;
    System.out.println("der Status wure geändert auf: " + neuerStatus);
  }

  public void anzeigen(){
    System.out.println("Sendungsnummer: " + sendungsnummer);
    System.out.println("Gewicht: " + gewicht);
    System.out.println("Status: " + status);
    System.out.println("Express: " + express);
    if (gewicht > 20) {
    System.out.println("Sperrgut");
}
  }

  public Double getGewicht(){
    return gewicht;
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

