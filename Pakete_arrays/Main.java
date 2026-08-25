package Pakete_arrays;

public class Main {
    public static void main(String[] args) {

        Paket [] lager = new Paket[5];

        lager[0] = new Paket("P1001", 4.5, "Offen");
        lager[1] = new Paket("P1002", 2.0, "Unterwegs");
        lager[2] = new Paket("P1003", 3.0, "Zugestellt");

        for (int i = 0; i < lager.length; i++) {
            if(lager[i] != null){
                Utility.trennung();
                lager[i].anzeigen();
                Utility.trennung();
            }
        }
    }

}
