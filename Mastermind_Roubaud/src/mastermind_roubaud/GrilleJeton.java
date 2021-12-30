/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_roubaud;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class GrilleJeton {
    Jeton [][] grille = new Jeton[4][12];
    int nbTour = 0;
    
    public void ajouterJetonCase(Jeton j, int rang){
        grille[rang][nbTour] = j;
    }
    
    
}