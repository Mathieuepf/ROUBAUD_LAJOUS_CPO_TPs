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
        Grille Tgrille = new Grille();
        Jeton Jtest = new Jeton("rouge");
        
        Tgrille.ajouterJetonDansColonne(Jtest, 1);
        
        System.out.println(Tgrille.etreRemplie());
        
        for(int i=0 ; i<6 ; i++){
            for(int j=0 ; j<7 ; j++){
                Jeton Jest2 = new Jeton("jaune");
                Tgrille.ajouterJetonDansColonne(Jest2, j);
            }
        }
        System.out.println(Tgrille.etreRemplie());
        
    }
    
}
