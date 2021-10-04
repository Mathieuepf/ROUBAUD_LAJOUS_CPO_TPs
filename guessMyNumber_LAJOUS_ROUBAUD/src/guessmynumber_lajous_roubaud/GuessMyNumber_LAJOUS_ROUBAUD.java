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
        
        //istructions
        while (nombreA != essaie){
            System.out.println("Entrez un nombre aléatoire entre 0 et 100");
            essaie = sc.nextInt();
            if(essaie < nombreA){
                System.out.println("trop petit"); 
            }
            if(essaie > nombreA) {
                System.out.println("trop grand");
            }
        }
        System.out.println("gagné");
    }
    
}
