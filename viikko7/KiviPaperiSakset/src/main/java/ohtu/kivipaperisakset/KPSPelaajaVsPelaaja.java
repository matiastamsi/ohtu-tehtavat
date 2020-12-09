package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KiviPaperiSakset {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    protected String toisenSiirto(String ekanSiirtoEiVaikutusta) {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();  
    }
}