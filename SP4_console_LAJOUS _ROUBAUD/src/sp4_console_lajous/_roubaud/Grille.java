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
    
    public Grille (){
        for (int l = 0 ; l<6 ; l++){
            for(int c=0 ; c<7 ; c++){
                CellulesJeu[l][c]= new Cellule();
            }
        }
    }
    
    public boolean ajouterJetonDansColonne(Jeton c, int n){
        if(CellulesJeu[0][n].jetonCourant== null){
           CellulesJeu[0][n].jetonCourant = c;
           return true;
        }
        else{
            int l=0;
            while(CellulesJeu[l][n].jetonCourant!=null && l < 5){
                l=l+1;
            }
            if(CellulesJeu[l][n].jetonCourant != null){
                return false;
            }else{
                CellulesJeu[l][n].jetonCourant = c;
                return true;
            }
            
        }
    }
    
    public boolean etreRemplie(){
        for(int l = 0;l<6;l++){
            for(int c=0;c<7;c++){
                if(CellulesJeu[l][c].jetonCourant== null){
                    return false;
                }
            }
        }
        return true;
    }
}
