
public class Main_neu {
    public static void main(String[] args) {
        verarbeiteRueckwaerts(5);

        schritte(3);

        double gewicht = gesamtGewicht(10.5, 3);
        System.out.println("Gesamtgewicht: " + gewicht);

        double kosten = versandkosten(4, 0.0);
        System.out.println("Versandkosten: " + kosten);
    }

    public static void verarbeiteRueckwaerts(int nummer) {
        if (nummer > 0) {
            System.out.println("Paket " + nummer);
            verarbeiteRueckwaerts(nummer - 1);
        }
    }
    public static void schritte(int n) {
        if (n == -1) {
            return;
        }
        System.out.println("Schritte übrig: " + n);
        schritte(n - 1);
    }
    public static double gesamtGewicht(double g, int a){
        if (a == 0) {
            return 0;
        }
        return g + gesamtGewicht(g, a - 1);
    }
    public static double versandkosten(int schritte, double zp){
        if (schritte == 0) {
            return zp;
        }
        return zp + 2 + versandkosten(schritte - 1, zp);
    }
}