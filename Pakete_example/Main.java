 package Pakete_example;

class Paket {

    String sendungsnummer;
    double gewicht;
    String status;

    Paket(String sendungsnummer, double gewicht, String status) {
        this.sendungsnummer = sendungsnummer;
        this.gewicht = gewicht;
        this.status = status;
    }

    public double berechneVersandKosten() {
        if (gewicht <= 5) {
            return 4.99;
        }
        else if (gewicht <= 10) {
            return 7.99;
        }
        else if (gewicht <= 20) {
            return 11.99;
        }
        else {
            return 16.99;
        }
    }

}


public class Main {

    public static void main(String[] args) {
        Paket[] pakete = new Paket[20];

        pakete[0] = new Paket("S1001", 4.5, "eingegangen");
        pakete[1] = new Paket("S1002", 12.8, "sortiert");
        pakete[2] = new Paket("S1003", 25.4, "eingegangen");
        pakete[3] = new Paket("S1004", 8.2, "versendet");
        pakete[4] = new Paket("S1005", 17.6, "sortiert");
        pakete[5] = new Paket("S1006", 3.9, "eingegangen");
        pakete[6] = new Paket("S1007", 21.3, "versendet");
        pakete[7] = new Paket("S1008", 6.7, "sortiert");
        pakete[8] = new Paket("S1009", 14.2, "eingegangen");
        pakete[9] = new Paket("S1010", 9.5, "versendet");
        pakete[10] = new Paket("S1011", 31.8, "sortiert");
        pakete[11] = new Paket("S1012", 5.4, "eingegangen");
        pakete[12] = new Paket("S1013", 18.7, "versendet");
        pakete[13] = new Paket("S1014", 7.1, "sortiert");
        pakete[14] = new Paket("S1015", 22.5, "eingegangen");
        pakete[15] = new Paket("S1016", 11.3, "versendet");
        pakete[16] = new Paket("S1017", 4.8, "sortiert");
        pakete[17] = new Paket("S1018", 27.6, "eingegangen");
        pakete[18] = new Paket("S1019", 13.9, "versendet");
        pakete[19] = new Paket("S1020", 8.6, "sortiert");

        gewichtAusgaben(pakete);
        System.out.println();
        statusAktualisieren(pakete);
        ausgabeStatus(pakete);
        System.out.println();

        System.out.println("Versandkosten:");
        for (int i = 0; i < pakete.length; i++) {
            System.out.println(pakete[i].sendungsnummer + ": " + pakete[i].berechneVersandKosten() + " Euro");
        }

        int position = lineareSuche(pakete, "S1017");

        if (position != -1) {
            System.out.println("Paket gefunden an Position " + position); 
        }
        else {
            System.out.println("Paket nicht gefunden."); 
        }
    }

    public static void gewichtAusgaben(Paket[] pakete) {
        for (int i = 0; i < pakete.length; i++) {
            System.out.println(pakete[i].gewicht);
        }
    }

    public static void statusAktualisieren(Paket[] pakete) {
        for (int i = 0; i < pakete.length; i++) {
            if (pakete[i].status.equals("eingegangen")) {
                pakete[i].status = "sortiert";
            }
        }
    }

    public static void ausgabeStatus(Paket[] pakete) {
        for (int i = 0; i < pakete.length; i++) {
            System.out.println(pakete[i].sendungsnummer + ": " + pakete[i].status);
        }
    }
    public static int lineareSuche(Paket[] pakete, String gesucht){

        for (int i = 0; i < pakete.length; i++) {

            if (pakete[i].sendungsnummer.equals(gesucht)) {
                return i;
            }
        }
        return -1;
    }

}