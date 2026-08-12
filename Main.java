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
}