/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_roubaud;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Partie {
    int nbTour = 0;
    GrilleJeton grilleJeu = new GrilleJeton();
    GrilleJeuReponse gPlace = new GrilleJeuReponse();
    GrilleJeuReponse gNonPlace = new GrilleJeuReponse();
    
    public void tourSuivant(){
        nbTour ++;
        grilleJeu.nbTour ++;
        gPlace.nbTour ++;
        gNonPlace.nbTour ++;
    }
    
    
}
