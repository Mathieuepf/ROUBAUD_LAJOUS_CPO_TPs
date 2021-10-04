/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint_lajous_roubaud;

import java.util.Scanner;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class ManipNombresInt_LAJOUS_ROUBAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int entier1;
        int entier2;
        int somme;
        int difference;
        int produit;
        
        //Instructions
        System.out.println("entrez vos deux nombres entiers");
        entier1 = sc.nextInt();
        entier2 = sc.nextInt();
        somme = entier1+entier2;
        difference = entier1-entier2;
        produit = entier1*entier2;
        System.out.println("nombre1 + nombre2 = " + somme + "\nnombre1 - nombre2 = " + difference + "\nnombre1 * nombre2 = " + produit);
        
    }
    
}
