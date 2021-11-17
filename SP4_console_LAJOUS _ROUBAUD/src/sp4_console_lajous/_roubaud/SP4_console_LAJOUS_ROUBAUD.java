/*
    SP4: Console
    LAJOUS Malô & ROUBAUD Mathieu
    Novembre 2021
 */
package sp4_console_lajous._roubaud;

import java.util.Scanner;

/**
 *
 * @author malol
 */
public class SP4_console_LAJOUS_ROUBAUD {


    public static void main(String[] args) {
        Joueur J1 = new Joueur("Patrique");
        Joueur J2 = new Joueur("MichMich");
        Partie game = new Partie(J1, J2);
        
        game.attribuerCouleursAuxJoueurs();
        game.initialiserPartie();
        game.debuterPartie();
        System.out.println("Partie fini");
    }
    
}
