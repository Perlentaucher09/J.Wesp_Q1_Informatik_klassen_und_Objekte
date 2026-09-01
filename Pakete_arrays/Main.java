package Pakete_arrays;

public class Main {
    public static void main(String[] args) {

        Paket[] pakete = new Paket[20];

        pakete[0] = new Paket("S1001", 4.5, "eingegangen", true);
        pakete[1] = new Paket("S1002", 12.8, "sortiert", false);
        pakete[2] = new Paket("S1003", 25.4, "eingegangen", false);
        pakete[3] = new Paket("S1004", 8.2, "versendet", true);
        pakete[4] = new Paket("S1005", 17.6, "sortiert", false);
        pakete[5] = new Paket("S1006", 3.9, "eingegangen", false);
        pakete[6] = new Paket("S1007", 21.3, "versendet", true);
        pakete[7] = new Paket("S1008", 6.7, "sortiert", false);
        pakete[8] = new Paket("S1009", 14.2, "eingegangen", false);
        pakete[9] = new Paket("S1010", 9.5, "versendet", true);
        pakete[10] = new Paket("S1011", 31.8, "sortiert", false);
        pakete[11] = new Paket("S1012", 5.4, "eingegangen", false);
        pakete[12] = new Paket("S1013", 18.7, "versendet", true);
        pakete[13] = new Paket("S1014", 7.1, "sortiert", false);
        pakete[14] = new Paket("S1015", 22.5, "eingegangen", false);
        pakete[15] = new Paket("S1016", 11.3, "versendet", true);
        pakete[16] = new Paket("S1017", 4.8, "sortiert", false);
        pakete[17] = new Paket("S1018", 27.6, "eingegangen", false);
        pakete[18] = new Paket("S1019", 13.9, "versendet", true);
        pakete[19] = new Paket("S1020", 8.6, "sortiert", false);

        Lager_methoden.gewichtausgeben(pakete);

        
        Lager_methoden.statusupdate(pakete, "sortiert");
        Lager_methoden.anzeigen(pakete);



        int position = Lager_methoden.lineareSuche(pakete, "S1017");
        if (position != -1) {
            System.out.println("Paket gefunden an Position " + position); 
            Utility.trennung();
        }
        else {
            System.out.println("Paket nicht gefunden."); 
            Utility.trennung();
        }



        int position2 = Lager_methoden.binaereSuche(pakete, "S1013");
        if (position2 != -1) {
            System.out.println("Paket gefunden an Position " + position2);
            Utility.trennung();
        }
        else {
            System.out.println("Paket nicht gefunden.");
            Utility.trennung();
        }
    }
}