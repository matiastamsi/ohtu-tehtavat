package ohtu.intjoukkosovellus;

import java.util.Scanner;

public class Sovellus {

    private static IntJoukko A, B, C;
    Scanner lukija = new Scanner(System.in);

    public IntJoukko mikaJoukko() {
        String luettu = lukija.nextLine();
        while (true) {
            if (luettu.equals("A") || luettu.equals("a")) {
                return A;
            } else if (luettu.equals("B") || luettu.equals("b")) {
                return B;
            } else if (luettu.equals("C") || luettu.equals("c")) {
                return C;
            } else {
                System.out.println("Virheellinen joukko! " + luettu);
                System.out.print("Yritä uudelleen!");
                luettu = lukija.nextLine();
            }
        }
    }

    public void lisaa() {
        System.out.print("Mihin joukkoon? ");
        IntJoukko joukko = mikaJoukko();
        System.out.println("");
        System.out.print("Mikä luku lisätään? ");
        int lisLuku = lukija.nextInt();
        System.out.println(lisLuku);
        joukko.lisaa(lisLuku);
    }

    public void yhdiste() {
        IntJoukko[] joukot = kysyMitkaJoukot();
        IntJoukko c = IntJoukko.yhdiste(joukot[0], joukot[1]);
        System.out.println("A yhdiste B = " + c.toString());
    }

    public void leikkaus() {
        IntJoukko[] joukot = kysyMitkaJoukot();
        IntJoukko c = IntJoukko.leikkaus(joukot[0], joukot[1]);
        System.out.println("A leikkaus B = " + c.toString());
    }

    public void erotus() {
        IntJoukko[] joukot = kysyMitkaJoukot();
        IntJoukko c = IntJoukko.erotus(joukot[0], joukot[1]);
        System.out.println("A erotus B = " + c.toString());
    }

    public IntJoukko[] kysyMitkaJoukot() {
        IntJoukko[] joukot = new IntJoukko[2];
        System.out.print("1. joukko? ");
        IntJoukko aJoukko = mikaJoukko();
        joukot[0] = aJoukko;
        System.out.print("2. joukko? ");
        IntJoukko bJoukko = mikaJoukko();
        joukot[1] = bJoukko;
        return joukot;
    }

    public void poista() {
        System.out.print("Mistä joukosta? ");
        IntJoukko joukko = mikaJoukko();
        System.out.print("Mikä luku poistetaan? ");
        int lisLuku = lukija.nextInt();
        joukko.poista(lisLuku);
    }

    public void kuuluu() {
        System.out.print("Mihin joukkoon? ");
        IntJoukko joukko = mikaJoukko();
        System.out.print("Mikä luku? ");
        int kysLuku = lukija.nextInt();
        boolean kuuluuko = joukko.kuuluu(kysLuku);
        if (kuuluuko) {
            System.out.println(kysLuku + " kuuluu joukkoon ");
        } else {
            System.out.println(kysLuku + " ei kuulu joukkoon ");
        }
    }

    public void kaynnista() {
        A = new IntJoukko();
        B = new IntJoukko();
        C = new IntJoukko();
        String luettu;

        System.out.println("Tervetuloa joukkolaboratorioon!");
        System.out.println("Käytössäsi ovat joukot A, B ja C.");
        System.out.println("Komennot ovat lisää(li), poista(p), kuuluu(k), yhdiste(y), erotus(e), leikkaus(le) ja lopetus(quit)(q).");
        System.out.println("Joukon nimi komentona tarkoittaa pyyntöä tulostaa joukko.");

        while (true) {
            luettu = lukija.nextLine();
            if (luettu.equals("lisää") || luettu.equals("li")) {
                lisaa();
            } else if (luettu.equalsIgnoreCase("poista") || luettu.equalsIgnoreCase("p")) {
                poista();
            } else if (luettu.equalsIgnoreCase("kuuluu") || luettu.equalsIgnoreCase("k")) {
                kuuluu();
            } else if (luettu.equalsIgnoreCase("yhdiste") || luettu.equalsIgnoreCase("y")) {
                yhdiste();
            } else if (luettu.equalsIgnoreCase("leikkaus") || luettu.equalsIgnoreCase("le")) {
                leikkaus();
            } else if (luettu.equalsIgnoreCase("erotus") || luettu.equalsIgnoreCase("e")) {
                erotus();
            } else if (luettu.equalsIgnoreCase("A")) {
                System.out.println(A);
            } else if (luettu.equalsIgnoreCase("B")) {
                System.out.println(B);
            } else if (luettu.equalsIgnoreCase("C")) {
                System.out.println(C);
            } else if (luettu.equalsIgnoreCase("lopeta") || luettu.equalsIgnoreCase("quit") || luettu.equalsIgnoreCase("q")) {
                System.out.println("Lopetetaan, moikka!");
                break;
            } else {
                if (luettu.isEmpty()) {
                    continue;
                }
                System.out.println("Virheellinen komento! " + luettu);
                System.out.println("Komennot ovat lisää(li), poista(p), kuuluu(k), yhdiste(y), erotus(e) ja leikkaus(le).");
            }
            System.out.println("Komennot ovat lisää(li), poista(p), kuuluu(k), yhdiste(y), erotus(e) ja leikkaus(le).");
        }
    }
}
