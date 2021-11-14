/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lajous._roubaud;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Partie {
    Joueur [] ListeJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu;
    
    public Partie(Joueur J1, Joueur J2){
        ListeJoueur[0] = J1;
        ListeJoueur[1] = J2;
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
    
    public void debuterPartie(){
        
        //Variables nécessaires au fonctionnement
        Scanner sc = new Scanner(System.in);
        int ColonneSaisie;
        boolean place = false;
        
        //Boucle infinie qui finit quand un joueur a gagné
        while(1==1){
            for(int i=0 ; i<2 ; i++){
                joueurCourant = ListeJoueur[i];
                
                //Boucle de placement du pion
                while(place == false){
                
                    //Récupération de l'entrée du joueur
                    System.out.println("Veuillez saisir la colonne dans laquelle vous voulez jouer");
                    ColonneSaisie = sc.nextInt();
                    while(ColonneSaisie > 7 || ColonneSaisie <= 0){
                        System.out.println("Erreur, valeur non comprise entre 0 et 7 veuillez saisir une colonne");
                        ColonneSaisie = sc.nextInt();
                    }

                    //utilisation d'un jeton dans la case
                    joueurCourant.nombreJetonsRestants -= 1;

                    //effet du jeton sur la partie
                    place = grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] , ColonneSaisie);
                    if(place == false){
                        continue;
                    }else{
                        break;
                    }
                }
                
                //vérification si partie terminée
                //if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]) || grilleJeu.etreGagnantePourJoueur(ListeJoueur[1])){
                //    break;
                //}
            }
            
            //vérification si partie terminée
            //if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]) || grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]) || grilleJeu.etreRemplie()){
            //    break;
            //}
        }
    }
}
