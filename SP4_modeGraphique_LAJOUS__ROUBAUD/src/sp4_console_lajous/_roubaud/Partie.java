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
    Grille grilleJeu = new Grille();

    public Partie(Joueur J1, Joueur J2){
        ListeJoueur[0] = J1;
        ListeJoueur[1] = J2;
    }

    public void attribuerCouleursAuxJoueurs(){
        if(new Random().nextInt(2) == 1){
            ListeJoueur[0].Couleur = "jaune";
            ListeJoueur[1].Couleur = "rouge";
        }
        else{
            ListeJoueur[1].Couleur = "jaune";
            ListeJoueur[0].Couleur = "rouge";
        }
    }

    public void initialiserPartie(){
        
        //Création des jetons
        for(int i=0 ; i<21 ; i++){
            Jeton JetonJ1 = new Jeton(ListeJoueur[0].Couleur);
            ListeJoueur[0].ajouterJeton(JetonJ1);
            Jeton JetonJ2 = new Jeton(ListeJoueur[1].Couleur);
            ListeJoueur[1].ajouterJeton(JetonJ2);
        }
        
        //Placement des trous noirs
        int i = 0;
        while(i<5){
            int colonne = new Random().nextInt(7);
            int ligne = new Random().nextInt(6);
            if(grilleJeu.CellulesJeu[ligne][colonne].presenceTrouNoir() == false){
                grilleJeu.CellulesJeu[ligne][colonne].placerTrouNoir();
                i += 1;
            }
        }
        
        //Placement désintegrateurs
        
        //Placement des desintegrateurs visibles
        i = 0;
        while(i<3){
            int colonne = new Random().nextInt(7);
            int ligne = new Random().nextInt(6);
            if(grilleJeu.CellulesJeu[ligne][colonne].presenceTrouNoir() == false && grilleJeu.CellulesJeu[ligne][colonne].presenceDesintegrateur() == false){
                grilleJeu.CellulesJeu[ligne][colonne].placerDesintegrateur();
                i += 1;
            }
        }
        
        //Placement des desintegrateurs sur trous noirs
        int T1 = new Random().nextInt(5);
        int T2 = new Random().nextInt(5);
        while(T1 == T2){
            T2 = new Random().nextInt(5);
        }
        int compteur = 0;
        for(i=0 ; i<6 ; i++){
            for(int j=0 ; j<7 ; j++){
                if(grilleJeu.CellulesJeu[i][j].presenceTrouNoir()){
                    compteur += 1;
                    if(compteur == T1 || compteur == T2){
                        grilleJeu.CellulesJeu[i][j].placerDesintegrateur();
                    }
                }
            }
        }
    }
    
    public void debuterPartie(){
        
        //Variables nécessaires au fonctionnement
        Scanner sc = new Scanner(System.in);
        int ColonneSaisie;
        boolean place = false;
        
        //Boucle infinie qui finit quand un joueur a gagné
        while(1==1){
            for(int q=0 ; q<2 ; q++){
                joueurCourant = ListeJoueur[q];
                System.out.println("C'est à "+joueurCourant.nom+" de jouer, vous avez " + joueurCourant.nombreJetonsRestants + " jetons ("+joueurCourant.Couleur+")");
                
                
                //vérification si partie terminée
                if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]) || grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]) || grilleJeu.etreRemplie()){
                    break;
                }
                //Affichage de la grille
                grilleJeu.afficherGrilleSurConsole();
                
                //Cas joueurCourant n'a plus de jetons (=récupération obligatoire
                if(joueurCourant.ListeJetons[0] == null){
                    System.out.println("Saisissez la ligne puis la colonne dans laquelle vous voulez retirer un pion (de votre couleur uniquement)");
                    int Ligne = sc.nextInt();
                    int Colonne = sc.nextInt();

                    while(Ligne < 1 || Ligne > 6 || Colonne < 1 || Colonne > 7 || grilleJeu.CellulesJeu[Ligne-1][Colonne-1].jetonCourant == null || grilleJeu.CellulesJeu[Ligne-1][Colonne-1].jetonCourant.lireCouleur() != joueurCourant.Couleur){
                        System.out.println("Erreur coordonnées incorrectes");
                        System.out.println("Saisissez la ligne puis la colonne dans laquelle vous voulez retirer un pion (de votre couleur uniquement)");
                        Ligne = sc.nextInt();
                        Colonne = sc.nextInt();
                    }

                    Ligne -= 1;
                    Colonne -= 1;


                    joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] = grilleJeu.CellulesJeu[Ligne][Colonne].recupererJeton();
                    joueurCourant.nombreJetonsRestants += 1;
                    grilleJeu.CellulesJeu[Ligne][Colonne].supprimerJeton();
                    grilleJeu.tasserGrille(Colonne);
                    continue;
                }

                //Récupération de l'entrée du joueur
                if(joueurCourant.nombreDesintegrateurs != 0){
                    System.out.println("Voulez-vous jouer un désintégrateur ? (Oui : 1 / Non : 2)");    
                    int reponse = sc.nextInt();

                    //Cas joueur joue un désintégrateur
                    if(reponse == 1){
                        System.out.println("Saisissez la ligne puis la colonne dans laquelle vous voulez désintégrer un pion");
                        int ligne = sc.nextInt();
                        int colonne = sc.nextInt();
                        while(ligne < 1 || ligne > 6 || colonne < 1 || colonne > 7 || grilleJeu.CellulesJeu[ligne-1][colonne-1].jetonCourant == null || grilleJeu.CellulesJeu[ligne-1][colonne-1].jetonCourant.lireCouleur() != joueurCourant.Couleur){
                            System.out.println("Erreur coordonnées incorrectes");
                            ligne = sc.nextInt();
                            colonne = sc.nextInt();
                        }
                        
                        grilleJeu.CellulesJeu[ligne-1][colonne-1].supprimerJeton();
                        joueurCourant.utiliserDesintegrateur();
                        grilleJeu.tasserGrille(colonne-1);
                        continue;
                    }
                }
                
                boolean test = false;
                for(int i=0 ; i<6 ; i++){
                    for(int j=0 ; j<7 ; j++){
                        if(grilleJeu.CellulesJeu[i][j].lireCouleurDuJeton() == joueurCourant.Couleur){
                            test = true;
                            break;
                        }
                    }
                    if(test){
                        break;
                    }
                }

                //Possibiliter de récupérer un jeton
                if(test){
                    System.out.println("Voulez-vous récupérer un jeton ? (Oui : 1 / Non : 2)");
                    int Reponse = sc.nextInt();
                    if(Reponse == 1){
                        System.out.println("Saisissez la ligne puis la colonne dans laquelle vous voulez retirer un pion (de votre couleur uniquement)");
                        int Ligne = sc.nextInt();
                        int Colonne = sc.nextInt();

                        while(Ligne < 1 || Ligne > 6 || Colonne < 1 || Colonne > 7 || grilleJeu.CellulesJeu[Ligne-1][Colonne-1].jetonCourant == null || grilleJeu.CellulesJeu[Ligne-1][Colonne-1].jetonCourant.lireCouleur() != joueurCourant.Couleur){
                            System.out.println("Erreur coordonnées incorrectes");
                            System.out.println("Saisissez la ligne puis la colonne dans laquelle vous voulez retirer un pion (de votre couleur uniquement)");
                            Ligne = sc.nextInt();
                            Colonne = sc.nextInt();
                        }

                        Ligne -= 1;
                        Colonne -= 1;


                        joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] = grilleJeu.CellulesJeu[Ligne][Colonne].recupererJeton();
                        joueurCourant.nombreJetonsRestants += 1;
                        grilleJeu.CellulesJeu[Ligne][Colonne].supprimerJeton();
                        grilleJeu.tasserGrille(Colonne);
                        continue;
                    }
                }
            

                //Cas de jeu normal

                while(1 == 1){
                    System.out.println("Veuillez saisir la colonne dans laquelle vous voulez jouer");
                    ColonneSaisie = sc.nextInt();
                    if(ColonneSaisie > 7 || ColonneSaisie < 1){
                        System.out.println("Erreur, valeur non comprise entre 0 et 7");
                        continue;
                    }
                    if(grilleJeu.CellulesJeu[5][ColonneSaisie - 1].jetonCourant != null){
                        System.out.println("Erreur, colonne remplie");
                        continue;
                    }
                    break;
                }

                //utilisation d'un jeton dans la case
                joueurCourant.nombreJetonsRestants -= 1;

                //effet du jeton sur la partie
                place = grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] , ColonneSaisie-1);

                for(int i=0 ; i<6 ; i++){
                    if(grilleJeu.CellulesJeu[i][ColonneSaisie-1].presenceDesintegrateur() && grilleJeu.CellulesJeu[i][ColonneSaisie-1].jetonCourant != null){
                        grilleJeu.CellulesJeu[i][ColonneSaisie-1].recupererDesingrateur();
                        joueurCourant.obtenirDesintegrateur();
                        grilleJeu.tasserGrille(ColonneSaisie-1);
                        System.out.println("Vous avez récupéré un désintégrateur !");
                    }
                    if(grilleJeu.CellulesJeu[i][ColonneSaisie-1].presenceTrouNoir() && grilleJeu.CellulesJeu[i][ColonneSaisie-1].jetonCourant != null){
                        grilleJeu.CellulesJeu[i][ColonneSaisie-1].activerTrouNoir();
                        grilleJeu.tasserGrille(ColonneSaisie-1);
                    }
                }
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] = null;
            }

            //vérification si partie terminée
            if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]) || grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]) || grilleJeu.etreRemplie()){
                break;
            }
        }

        if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]) && grilleJeu.etreGagnantePourJoueur(ListeJoueur[1])){
            System.out.println("Le joueur " + joueurCourant.nom + " a perdu");
        }else if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[0])){
            System.out.println("Le joueur " + ListeJoueur[0].nom + " a gagné");
        }else if(grilleJeu.etreGagnantePourJoueur(ListeJoueur[1])){
            System.out.println("Le joueur " + ListeJoueur[1].nom + " a gagné");
        }
    }
}