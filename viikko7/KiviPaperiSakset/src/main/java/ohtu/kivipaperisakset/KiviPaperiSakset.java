package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KiviPaperiSakset {

    private static final Scanner scanner = new Scanner(System.in);
    private String ekanSiirto = "";
    private String tokanSiirto = "";

    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        this.ekanSiirto = ensimmaisenSiirto();
        this.tokanSiirto = toisenSiirto(ekanSiirto);
        while (onkoOkSiirto(this.ekanSiirto) && onkoOkSiirto(this.tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            this.ekanSiirto = ensimmaisenSiirto();
            this.tokanSiirto = toisenSiirto(ekanSiirto);
        }
        System.out.println("Kiitos!\n" + tuomari);
    }

    protected String ensimmaisenSiirto() {
        System.out.println("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    abstract protected String toisenSiirto(String ekanSiirto);

    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
