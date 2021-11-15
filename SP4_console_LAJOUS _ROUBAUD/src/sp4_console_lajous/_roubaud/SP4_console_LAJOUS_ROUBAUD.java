/*
    SP4: Console
    LAJOUS Malô & ROUBAUD Mathieu
    Novembre 2021
 */
package sp4_console_lajous._roubaud;

/**
 *
 * @author malol
 */
public class SP4_console_LAJOUS_ROUBAUD {


    public static void main(String[] args) {
        Joueur J1 = new Joueur("Mich");
        Joueur J2 = new Joueur("Lou");
        
        Partie Tpartie = new Partie(J1, J2);
        Tpartie.attribuerCouleursAuxJoueurs();
        System.out.println(J1.Couleur+J2.Couleur);
        
        Tpartie.initialiserPartie();
    }
    
}
