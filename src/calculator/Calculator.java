/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        int answer;
        int operande1;
        int operande2;
        int resultat;
        resultat = 0;
        
        //Instructions
        System.out.println("1) add\n2) substract\n3) multiply\n4) divide\n5) modulo");
        answer = sc.nextInt();
        if (answer!=1 && answer!=2 && answer!=3 && answer!=4 && answer!=5){
            System.out.println("erreur oppérateur non proposé");
            System.exit(0);
        }
        

        System.out.println("Entrez votre première valeur");
        operande1 = sc.nextInt();
        System.out.println("Entrez votre deuxième valeur");
        operande2 = sc.nextInt();
        
        switch(answer) {
            case 1 : //cas addition
                resultat = operande1 + operande2;
                break;
            case 2 : //cas soustraction
                resultat = operande1 - operande2;
                break;
            case 3 : //cas multiplication
                resultat = operande1 * operande2;
                break;
            case 4 : //cas division
                resultat = operande1 / operande2;
                break;
            case 5 : //cas modulo
                resultat = operande1 % operande2;
                break;
    }   
        System.out.println("le résultat est "+ resultat);
    }
}
