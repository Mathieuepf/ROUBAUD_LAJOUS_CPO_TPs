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
public class Grille {
    Cellule CellulesJeu[][] = new Cellule [6][7];
    
    public void Grille (){
        for (int l = 0;l<6;l++){
            for(int c=0;c<7;c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
    }
}
