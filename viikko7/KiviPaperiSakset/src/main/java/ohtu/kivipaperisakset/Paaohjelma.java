package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);
    private static KiviPaperiSakset peli;
    private static HashMap<String, KiviPaperiSakset> pelit = new HashMap();

    public static void main(String[] args) {
        pelit.put("a", new KPSPelaajaVsPelaaja());
        pelit.put("b", new KPSTekoaly());
        pelit.put("c", new KPSParempiTekoaly());
        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
            String vastaus = scanner.nextLine();

            if (!(vastaus.equals("a")
                    || vastaus.equals("b")
                    || vastaus.equals("c"))) {
                break;
            }
            peli = pelit.get(vastaus);
            System.out.println("peli loppuu kun pelaaja antaa virheellisen"
                    + " siirron eli jonkun muun kuin k, p tai s");
            peli.pelaa();
        }
    }
}
