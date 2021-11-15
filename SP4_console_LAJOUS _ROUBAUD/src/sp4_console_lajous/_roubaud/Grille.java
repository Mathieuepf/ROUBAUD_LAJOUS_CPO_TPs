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
    
    public void viderGrille (){
        for(int l = 0;l<6;l++){
            for(int c=0;c<7;c++){
                CellulesJeu[l][c].jetonCourant= null;
            }
        }
    }
    
    public void afficherGrilleSurConsole (){
        for (int l=0; l<6;l++){
            for (int c=0;c<7;){
                if (CellulesJeu[l][c].jetonCourant == null){
                    System.out.print("  O  ");
                }
                else if(CellulesJeu[l][c].jetonCourant.Couleur== "Jaune"){
                    System.out.print("  J  ");
                }
                else if(CellulesJeu[l][c].jetonCourant.Couleur== "Rouge"){
                    System.out.print("  R  ");
                }
                else{
                    System.out.print("  N  ");
                }
            }
            System.out.println("");
        }
    }
    
    public boolean celluleOccupee(int l, int c){
        if (CellulesJeu[l][c].jetonCourant != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String lireCouleurDuJeton (int l, int c){
        return CellulesJeu[l][c].lireCouleurDuJeton();
    }

  
    public boolean etreGagnantePourJoueur(Joueur J){
        
        int compteur;
        //Verification si ligne gagnante
        
        for(int i=0 ; i<4 ; i++){
            for(int l=0 ; l<6 ; l++){
                compteur = 0;
                for(int c=i ; c<4+i ; c++){
                    if(J.Couleur == CellulesJeu[l][c].lireCouleurDuJeton()){
                        compteur += 1;
                    }
                }
                if(compteur == 4){
                    return true;
                }
            }
        }
        
        //Verification si colonne gagnante
        for(int i=0 ; i<3 ; i++){
            for(int c=0 ; c<7 ; c++){
                compteur = 0;
                for(int l=i ; l<4+i ; l++){
                    if(J.Couleur == CellulesJeu[l][c].lireCouleurDuJeton()){
                        compteur += 1;
                    }
                }
                if(compteur == 4){
                    return true;
                }
            }
        }
        
        //Verification si diagonale montante gagnante
        for(int l=0 ; l<3 ; l++){
            for(int c=0 ; c<4 ; c++){
                if(J.Couleur == CellulesJeu[l][c].lireCouleurDuJeton() && J.Couleur == CellulesJeu[l+1][c+1].lireCouleurDuJeton() && J.Couleur == CellulesJeu[l+2][c+2].lireCouleurDuJeton() && J.Couleur == CellulesJeu[l+3][c+3].lireCouleurDuJeton()){
                    return true;
                }
            }
        }
        
        //Verification si diagonale descendante gagnante
        for(int l=3 ; l<6 ; l++){
            for(int c=0 ; c<4 ; c++){
                if(J.Couleur == CellulesJeu[l][c].lireCouleurDuJeton() && J.Couleur == CellulesJeu[l-1][c+1].lireCouleurDuJeton() && J.Couleur == CellulesJeu[l-2][c+2].lireCouleurDuJeton() && J.Couleur == CellulesJeu[l-3][c+3].lireCouleurDuJeton()){
                    return true;
                }
                
                
            }
        }
        
        //cas partie non finie
        return false;
    }
}
