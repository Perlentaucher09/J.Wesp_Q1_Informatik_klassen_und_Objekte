package Pakete_arrays;

class Paket {
    String sendungsNr;
    Double gewicht;
    String status;
    

    Paket(String sendungsNr, Double gewicht, String status){
        this.sendungsNr = sendungsNr;
        this.gewicht = gewicht;
        this.status = status;
    }
    public void anzeigen(){
        System.out.println("Sendungsnummer: " + sendungsNr);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Status: " + status);
    }
}
