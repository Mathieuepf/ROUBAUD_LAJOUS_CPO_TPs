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
    int nombreDesintegrateurs;
    
    public Joueur (String player){
        nom=player;
    }
    public void affecterCouleur (String c){
     Couleur=c;   
    }
    public void ajouterJeton (Jeton n){
        if(ListeJetons == null){
            ListeJetons = new Jeton[1];
            ListeJetons[0] = n;
        }else{
            Jeton [] SaveList = ListeJetons;
            ListeJetons = new Jeton[ListeJetons.length+1];
            for(int i=0 ; i<SaveList.length ; i++){
                ListeJetons[i] = SaveList[i];
            }
            ListeJetons[ListeJetons.length-1]=n;    
        }
        
    }
    public void obtenirDesintegrateur(){
        nombreDesintegrateurs=nombreDesintegrateurs+1;
    }
    public boolean utiliserDesintegrateur(){
        if (nombreDesintegrateurs<=0){
            return false;
        }
        else{
            nombreDesintegrateurs=nombreDesintegrateurs-1;
            return true;
        }
    }
}
