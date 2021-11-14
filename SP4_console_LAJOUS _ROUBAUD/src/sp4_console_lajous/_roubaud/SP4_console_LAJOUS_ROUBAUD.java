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
        Joueur Jtest = new Joueur("MichMich");
        Jtest.affecterCouleur("rouge");
        
        for(int i=0 ; i<26 ; i++){
            Jeton Tjeton = new Jeton("rouge");
            Jtest.ajouterJeton(Tjeton);
        }
        
        
    }
    
}
