package Pakete_arrays;

class Lager_methoden{
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
    
    public static void statusupdate (Paket[] pakete, String neuerStatus){
        for (int i = 0; i < pakete.length; i++){
            if (pakete[i] != null && pakete[i].status == "eingegangen"){
                pakete[i].statusupdate(neuerStatus);
            }
    }
    }

    public static int lineareSuche(Paket[] pakete, String gesucht){

        for (int i = 0; i < pakete.length; i++) {

            if (pakete[i].sendungsNr.equals(gesucht)) {
                return i;
            }
        }
        return -1;
    }
    public static int binaereSuche(Paket[] pakete, String gesucht) {

        int low = 0;
        int high = pakete.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (pakete[mid].sendungsNr.equals(gesucht)) {
                return mid;
            }

            if (pakete[mid].sendungsNr.compareTo(gesucht) < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
