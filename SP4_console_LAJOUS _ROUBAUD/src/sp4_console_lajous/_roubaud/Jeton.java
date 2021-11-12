/*
    SP4 / Console : Classe Joueur
    LAJOUS Malô & ROUBAUD Mathieu
    Novembre 2021
*/
package sp4_console_lajous._roubaud;

/**
 *
 * @author malol
 */
class Jeton {
    String Couleur;
    
    public Jeton(String Color){
       Couleur = Color;
    }
    
    public String lireCouleur(){
        return Couleur;
    }
}
