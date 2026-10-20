
public static void main(String[] args) {
    verarbeiten(1, 3);
    System.out.println();
    verarbeiten_sofia(1);
    System.out.println();
    verarbeiten_rueckwerts(5);
}
public static void verarbeiten(int n, int max) {
    if (n > max) {
        return;
    }
    System.out.println("start " + n);
    verarbeiten(n + 1, max);
    System.out.println("end " + n);
}

public static void verarbeiten_sofia(int n) {
    if (n < 4) {
        System.out.println("start " + n);
        verarbeiten_sofia(n+1);
        System.out.println("end " + n);
    }
}

public static void verarbeiten_rueckwerts(int n) {
    System.out.println("ausgeführt " + n);
    if (n > 0) {
        System.out.println("Paket " + n);
        verarbeiten_rueckwerts(n-1);
        
    }
    else {
        System.out.println("Abbruchbedingung erreicht");
    }
    System.out.println("beendet " + n);
}

public static void verarbeiten_rueckwerts_clean(int n) {
    if (n > 0) {
        System.out.println("Paket " + n);
        verarbeiten_rueckwerts_clean(n-1);
    }
}
    