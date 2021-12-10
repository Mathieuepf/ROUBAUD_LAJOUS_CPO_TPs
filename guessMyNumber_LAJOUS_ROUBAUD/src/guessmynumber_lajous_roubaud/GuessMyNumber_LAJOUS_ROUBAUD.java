/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_lajous_roubaud;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class GuessMyNumber_LAJOUS_ROUBAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //modules
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);
        
        //variables
        int nombreA = generateurAleat.nextInt(100);
        int essaie = -2;
        int compteur = 0;
        int niveau = 0;
        int cauchemar;
        
        //istructions
        while (niveau != 1 && niveau != 2 && niveau != 3 && niveau != 4){
            System.out.println("Choisissez le niveau de difficulté\nniveau 1 : intervale entre 0 et 50 et indications simplifiées\nniveau 2 : intervale entre 0 et 100 et indications standards\nniveau 3 : intervale entre 0 et 100 nombre d'essaies limités à 10 et indications standards\nniveau 4 : cauchemar");
            niveau = sc.nextInt();
            if (niveau == 1 || niveau == 2 || niveau == 3){
                break;
            }
        }
            
        if (niveau == 1){
            nombreA = generateurAleat.nextInt(50);
            while (nombreA != essaie){
                System.out.println("Entrez votre essaie entre 0 et 50");
                essaie = sc.nextInt();
                if(essaie < nombreA){
                    if (essaie+20 < nombreA){
                        System.out.println("vraiment trop petit");
                    }
                    else{
                        System.out.println("trop petit");
                    }    
                }
                else{
                    if(essaie > nombreA){
                        if (essaie-20 > nombreA){
                            System.out.println("vraiment trop grand");
                        }
                        else{
                            System.out.println("trop grand");
                        }
                    }
                }
                compteur ++;
            }
            System.out.println("gagné avec " + compteur + " tentatives");
        }
        
        
        
        if (niveau == 2){
            while (nombreA != essaie){
            System.out.println("Entrez votre essaie entre 0 et 100");
            essaie = sc.nextInt();
            if(essaie < nombreA){
                System.out.println("trop petit"); 
            }
            if(essaie > nombreA) {
                System.out.println("trop grand");
            }
            compteur ++;
            }
            System.out.println("gagné avec " + compteur + " tentatives");
        }
        
        
        if (niveau == 3){
            while (nombreA != essaie || compteur >= 10){
                System.out.println("Entrez votre essaie entre 0 et 100");
                essaie = sc.nextInt();
                if(essaie < nombreA){
                    System.out.println("trop petit"); 
                }
                if(essaie > nombreA) {
                    System.out.println("trop grand");
                }
                compteur ++;
            }
            if (compteur >= 10){
                System.out.println("perdu nombre d'essaies supérieur à 10");
            }
            else{
                System.out.println("gagné avec " + compteur + " tentatives");
            }
        }
        
        if(niveau == 4){
            while (nombreA != essaie){
            System.out.println("Entrez votre essaie entre 0 et 100");
            essaie = sc.nextInt();
            
            cauchemar = generateurAleat.nextInt(9);
            
            if (cauchemar < 3) {
                if (essaie <= nombreA){
                    essaie = nombreA+1;
                }else{
                    essaie = nombreA-1;
                }
            }
            
            if(essaie < nombreA){
                System.out.println("trop petit"); 
            }
            if(essaie > nombreA) {
                System.out.println("trop grand");
            }
            compteur ++;
            }
            System.out.println("gagné avec " + compteur + " tentatives");
            
        }
    }
}
