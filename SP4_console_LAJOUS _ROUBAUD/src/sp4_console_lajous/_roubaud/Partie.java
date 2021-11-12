/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lajous._roubaud;

import java.util.Random;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Partie {
    Joueur [] ListeJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public Partie(Joueur J1, Joueur J2){
        
    }
    
    public void attribuerCouleursAuxJoueurs(){
        if(new Random().nextInt(2) == 1){
            ListeJoueur[0].Couleur = "Jaune";
            ListeJoueur[1].Couleur = "rouge";
        }
        else{
            ListeJoueur[1].Couleur = "Jaune";
            ListeJoueur[0].Couleur = "rouge";
        }
    }
    
    public void initialiserPartie(){
        
        //Création de la grille
        grilleJeu = new Grille();
        
        //Création des jetons
        for(int i=0 ; i<21 ; i++){
            Jeton JetonJ1 = new Jeton(ListeJoueur[0].Couleur);
            ListeJoueur[0].ajouterJeton(JetonJ1);
            Jeton JetonJ2 = new Jeton(ListeJoueur[1].Couleur);
            ListeJoueur[1].ajouterJeton(JetonJ2);
        }
    }
}
