package Pakete_arrays;

class Lager{
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
