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
    Jeton [] ListeJetons;
    int nombreJetonsRestants;
    
    public Joueur (String player){
        nom=player;
    }
    public void affecterCouleur (String c){
     Couleur=c;   
    }
    public void ajouterJeton (Jeton n){
        ListeJetons = new Jeton[ListeJetons.length+1];        
        ListeJetons[ListeJetons.length-1]=n;
        System.out.println("nouveau jeton "+ListeJetons.length);
    }
}
