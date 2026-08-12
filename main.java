public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    }
}

class Paket{
  private String sendungsnummer;
  private Double gewicht;
  private String status;

  public void status_aendern(){
    System.out.println("der Status wure geändert");
  }
  public void anzeigen(){
    System.out.println("Sendungsnummer:" + sendungsnummer);
    System.out.println("Gewicht:" + gewicht);
    System.out.println("Status:" + status);
  }
}
