/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import java.util.Scanner;

/**
 * Main class for the application.
 *
 * @author tamsi
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aloitetaan tennis peli.");
        System.out.println("Anna ensimmäisen pelaajan nimi:");
        String name1 = scanner.nextLine();
        System.out.println("Anna toisen pelaajan nimi:");
        String name2 = scanner.nextLine();
        TennisGame game = new TennisGame(name1, name2);
        
        while(true) {
            System.out.println("Syöttämällä '1' voit päivittää pistetilannetta."
                    + "\nTulokset saa näkyviin syöttämällä '2'.");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("Kuka voitti pallon?");
                String winner = scanner.nextLine();
                game.wonPoint(winner);
            } else if (input.equals("2")) {
                System.out.println(game.getScore());
            }
        }
    }
}
