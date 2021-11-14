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
                System.out.println("cellule créée " + l + " " + c);
            }
        }
    }
    
    public boolean ajouterJetonDansColonne(Jeton c, int n){
        if(CellulesJeu[0][n].jetonCourant!= null){
           return true;
        }
        else{
            int l=0;
            CellulesJeu[l][n].jetonCourant=c;
            while(CellulesJeu[l+1][n].jetonCourant!=null || l<5){
                CellulesJeu[l+1][n].jetonCourant=CellulesJeu[l][n].jetonCourant;
                CellulesJeu[l][n].jetonCourant=null;
                l=l+1;
            }
            return false;
        }
    }
    
    public boolean etreRemplie(){
        for(int l = 0;l<6;l++){
            for(int c=0;c<7;c++){
                if(CellulesJeu[l][c]== null){
                    return true;
                }
            }
        }
        return false;
    }
}
