public class Main {
    public static void main(String[] args) {
      Paket p1 = new Paket("P1007", 5.0, "Neu", false);
      Paket p2 = new Paket("P1008", 25.0, "Unterwegs", true);
      Paket p3 = new Paket("P1009", 1.0, "Zugestellt", false);
      Paket p4 = new Paket("P1010", 15.0, "Neue", true);

      Utility.trennung();
      p1.anzeigen();
      Utility.trennung();
      p2.anzeigen();
      Utility.trennung();
      p3.anzeigen();
      Utility.trennung();
      p4.anzeigen();
      Utility.trennung();
    }
}


class Utility{
  public static void trennung(){
    System.out.println("================================");
  }
}


class Paket{
  private String sendungsnummer;
  private Double gewicht;
  private String status;
  private boolean express;

  public Paket(String sendungsNr, Double gewicht, String status, boolean express){//Konstruktor
    this.sendungsnummer = sendungsNr;
    this.gewicht = gewicht;
    this.status = status;
    this.express = express;
  }

  public void status_aendern(String neuerStatus){
    this.status = neuerStatus;
    System.out.println("der Status wure geändert auf: " + status());
  } 

  public void anzeigen(){
    System.out.println("Sendungsnummer: " + sendungsnummer);
    System.out.println("Gewicht: " + gewicht);
    System.out.println("Express: " + express);
    System.out.println("Status: " + status());
    System.out.println("Preis: " + berechnePreis() + " €");
    
    if (gewicht > 20) {
    System.out.println("------ Sperrgut ------");
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

  public String status() {
    switch(status.toLowerCase()){
      case "neu":
        return "Paketannahme";
      case "unterwegs":
        return "Transport";
      case "zugestellt":
        return "Archiv";
      default:
        System.out.println("Fehler: Status unbekannt");
        return null;
    }
  }
}

