package Pakete_arrays;

class Lager_methoden{

    private Paket[] pakete;
    private String name; 

    public Lager_methoden(String name, int size) {
        this.pakete = new Paket[size];
        this.name = name;
    }
    

    public void gewichtausgeben(){
        for (int i = 0; i < pakete.length; i++) {
            if(pakete[i] != null){
                Utility.trennung();
                System.out.println("Gewicht: " + pakete[i].gewicht);
            }
        }
        Utility.trennung();
    }

    public void anzeigen(){
        Utility.trennung();
        System.out.println();
        System.out.println("Lager: " + name);
        System.out.println();
        Utility.trennung();
        for (int i = 0; i < pakete.length; i++) {
            if(pakete[i] != null){
                Utility.trennung();
                pakete[i].anzeigen();
            }
        }
        Utility.trennung();
    } 
    
    public void statusupdate (String neuerStatus){
        for (int i = 0; i < pakete.length; i++){
            if (pakete[i] != null && pakete[i].status == "eingegangen"){
                pakete[i].statusupdate(neuerStatus);
            }
    }
    }

    public int lineareSuche(String gesucht){

        for (int i = 0; i < pakete.length; i++) {

            if (pakete[i].sendungsNr.equals(gesucht)) {
                return i;
            }
        }
        return -1;
    }

    public int binaereSuche(String gesucht) {

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
    public void addpaket(Paket paket) {
        for (int i = 0; i < pakete.length; i++) {
            if (pakete[i] == null) {
                pakete[i] = paket;
                return;
            }
        }
        System.out.println("Lager ist voll. Paket konnte nicht hinzugefügt werden.");
    }
}
