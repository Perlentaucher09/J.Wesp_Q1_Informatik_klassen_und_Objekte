package Pakete_arrays;

public class Main {
    public static void main(String[] args) {

        Paket [] pakete = new Paket[5];

        pakete[0] = new Paket("P1001", 4.5, "Offen", true);
        pakete[1] = new Paket("P1002", 12.8, "sortiert", false);
        pakete[2] = new Paket("P1003", 25.4, "eingegangen", false);
        pakete[3] = new Paket("P1004", 8.2, "versendet", true);

        gewichtausgeben(pakete);

        anzeigen(pakete);

    }
    public static void gewichtausgeben(Paket[] pakete){
        for (int i = 0; i < pakete.length; i++) {
            if(pakete[i] != null){
                Utility.trennung();
                System.out.println("Gewicht: " + pakete[i].gewicht);
            }
        }
        Utility.trennung();
    }
    
    public static void anzeigen(Paket[] pakete){
        for (int i = 0; i < pakete.length; i++) {
            if(pakete[i] != null){
                Utility.trennung();
                pakete[i].anzeigen();
            }
        }
        Utility.trennung();
    }
}