/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_lajous_roubaud;

import java.util.Scanner;

/**
 *
 * @author malol
 */
public class TP1_convertisseur_LAJOUS_ROUBAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Téléchargement Scanner
        Scanner sc;
        sc = new Scanner(System.in);
        
        //Déclaration variables:
        double reel=0;
        
        //  1.
        System.out.println("Veuillez entrer un réel:");
        reel=sc.nextDouble();
        System.out.println("Votre réel est "+reel);
        
        //  2.
        System.out.println("La température est de "+FarenheitVersKelvin(reel)+"° kelvin");  
    }
//  3.
    public static double CelciusVersKelvin(double tempCelcius){
        //Déclaration variables:
        double tempKelvin=0;
        tempKelvin=tempCelcius+273.15;
        return tempKelvin;
    }
//  4.
    public static double KelvinVersCelcius(double tempKelvin){
        //Déclaration variables:
        double tempCelcius=0;
        tempCelcius=tempKelvin-273.15;
        return tempCelcius;
    }
    public static double FarenheitVersCelcius(double tempFarenheit){
        //Déclaration variables:
        double tempCelcius=0;
        tempCelcius=(tempFarenheit-32)*5/9;
        return tempCelcius;
    }
    public static double CelciusVersFarenheit(double tempCelcius){
        //Déclaration variables:
        double tempFarenheit=0;
        tempFarenheit=tempCelcius*9/5+32;
        return tempFarenheit;
    }
    public static double KelvinVersFarenheit(double tempKelvin){
        //Déclaration variables:
        double tempFarenheit=0;
        tempFarenheit=tempKelvin*9/5-459.67;
        return tempFarenheit;
    }
    public static double FarenheitVersKelvin(double tempFarenheit){
        //Déclaration variables:
        double tempKelvin=0;
        tempKelvin=(tempFarenheit+459.67)*5/9;
        return tempKelvin;
    }
}
