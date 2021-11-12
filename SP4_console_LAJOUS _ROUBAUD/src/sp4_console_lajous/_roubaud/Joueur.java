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
public class Joueur {
    String nom;
    String Couleur;
    Jeton ListeJetons[];
    int nombreJetonsRestants;
    
    public void Joueur (String player){
        nom=player;
    }
    public void affecterCouleur (String c){
     Couleur=c;   
    }
    public void ajouterJeton (Jeton n){
        ListeJetons = new Jeton[1];
        ListeJetons[ListeJetons.length-1]=n;
    }
}
