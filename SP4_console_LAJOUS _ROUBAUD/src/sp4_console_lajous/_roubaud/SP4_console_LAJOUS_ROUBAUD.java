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
        Scanner sc = new Scanner(System.in);
        System.out.println("Joueur 1 entrez votre pseudo");
        String NJ1 = sc.nextLine();
        System.out.println("Joueur 2 entrez votre pseudo");
        String NJ2 = sc.nextLine();
        Joueur J1 = new Joueur(NJ1);
        Joueur J2 = new Joueur(NJ2);
        Partie game = new Partie(J1, J2);

        game.attribuerCouleursAuxJoueurs();
        game.initialiserPartie();
        game.debuterPartie();
        System.out.println("Partie fini");
        
    }
    
}
