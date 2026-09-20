package Pakete_arrays;

class SpeerPaket extends Paket {

    public SpeerPaket(String sendungsNr, Double gewicht, String status, boolean express) {
        super(sendungsNr, gewicht, status, express);
    }
    @Override 
    public Double berechnePreis()
    {
        return gewicht * 0.5 + 20;
    }
}
