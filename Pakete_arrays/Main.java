package Pakete_arrays;

public class Main {
    public static void main(String[] args) {

        Lager_methoden lager = new Lager_methoden("Lager Nr.1",20);

        

        lager.addpaket(new Paket("S1001", 4.5, "eingegangen", true));
        lager.addpaket(new Paket("S1002", 12.8, "sortiert", false));
        lager.addpaket(new Paket("S1003", 25.4, "eingegangen", false));
        lager.addpaket(new Paket("S1004", 8.2, "versendet", true));
        lager.addpaket(new Paket("S1005", 17.6, "sortiert", false));
        lager.addpaket(new Paket("S1006", 3.9, "eingegangen", false));
        lager.addpaket(new Paket("S1007", 21.3, "versendet", true));
        lager.addpaket(new Paket("S1008", 6.7, "sortiert", false));
        lager.addpaket(new Paket("S1009", 14.2, "eingegangen", false));
        lager.addpaket(new Paket("S1010", 9.5, "versendet", true));
        lager.addpaket(new Paket("S1011", 31.8, "sortiert", false));
        lager.addpaket(new Paket("S1012", 5.4, "eingegangen", false));
        lager.addpaket(new Paket("S1013", 18.7, "versendet", true));
        lager.addpaket(new Paket("S1014", 7.1, "sortiert", false));
        lager.addpaket(new Paket("S1015", 22.5, "eingegangen", false));
        lager.addpaket(new Paket("S1016", 11.3, "versendet", true));
        lager.addpaket(new Paket("S1017", 4.8, "sortiert", false));
        lager.addpaket(new Paket("S1018", 27.6, "eingegangen", false));
        lager.addpaket(new SpeerPaket("S1019", 13.9, "versendet", true));
        lager.addpaket(new KuehlPaket("S1020", 8.6, "sortiert", false));

        lager.gewichtausgeben();


        lager.statusupdate("sortiert");
        lager.anzeigen();




        int position = lager.lineareSuche("S1017");
        if (position != -1) {
            System.out.println("Paket gefunden an Position " + position); 
            Utility.trennung();
        }
        else {
            System.out.println("Paket nicht gefunden."); 
            Utility.trennung();
        }





        int position2 = lager.binaereSuche( "S1013");
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