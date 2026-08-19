class Utility{
  public static void trennung(){
    System.out.println("--------------------------------------------------");
  }
}


public class Main {
    public static void main(String[] args) {
      Paket p1 = new Paket("P1007", 25.8, "im Zustellfahrzeug");
      Paket p2 = new Paket("P1008", 71.9, "in zustellung");

      Utility.trennung();
      p1.anzeigen();
      System.out.println("Preis p1: " + Preis.berechnePreis(p1) + " €");
      Utility.trennung();
      p2.anzeigen();
      System.out.println("Preis p2: " + Preis.berechnePreis(p2) + " €");
      Utility.trennung();
      p1.status_aendern("zugestellt");
      Utility.trennung();
    }
}


class Paket{
  private String sendungsnummer;
  private Double gewicht;
  private String status;

  //Konstruktor

  public Paket(String sendungsNr, Double gewicht, String status){
    this.sendungsnummer = sendungsNr;
    this.gewicht = gewicht;
    this.status = status;
  }

  public void status_aendern(String neuerStatus){
    this.status = neuerStatus;
    System.out.println("der Status wure geändert auf: " + neuerStatus);
  }

  public void anzeigen(){
    System.out.println("Sendungsnummer: " + sendungsnummer);
    System.out.println("Gewicht: " + gewicht);
    System.out.println("Status: " + status);
  }

  public Double getGewicht(){
    return gewicht;
  }
}

class Preis{
  public static Double berechnePreis(Paket p){
    if (p.getGewicht() <= 2.0) {
      return 4.99;
    } else if (p.getGewicht() <= 5.0) {
      return 6.99;
    } else if (p.getGewicht() <= 10.0) {
      return 8.99;
    } else {
      return 12.99;
    }
  }
}