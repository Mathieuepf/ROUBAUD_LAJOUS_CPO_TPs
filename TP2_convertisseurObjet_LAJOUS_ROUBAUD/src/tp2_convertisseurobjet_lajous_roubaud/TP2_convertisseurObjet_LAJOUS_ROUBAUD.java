/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_lajous_roubaud;

import java.util.Scanner;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class TP2_convertisseurObjet_LAJOUS_ROUBAUD {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //  Téléchargement Scanner
        Scanner sc;
        sc = new Scanner(System.in);
        
        
        //  Déclaration variables:
        double reel;
        int convertion;
        Convertisseur Temperature;
        Temperature = new Convertisseur();
        
        
        while(1==1){
        //  Commandes globales
        System.out.println("Bonjour, saisissez une valeur :");
        reel=sc.nextDouble();
        System.out.println("""
                           Saisissez la conversion que vous souhaiter effectuer :
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius
                           3) De Farenheit vers Celcius
                           4) De Celcius vers Farenheit
                           5) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin""");
        convertion=sc.nextInt();
        
        if (convertion==1){
            System.out.println(reel+" degré Celcius est égal à "+Temperature.CelsiusVersKelvin(reel)+"° Kelvin" + Temperature);
        }
        if (convertion==2){
            System.out.println(reel+" degré Kelvin est égal à "+Temperature.KelvinVersCelsius(reel)+"° Celcius" + Temperature);
        }
        if (convertion==3){
            System.out.println(reel+" degré Farenheit est égal à "+Temperature.FarenheitVersCelsius(reel)+"° Celcius" + Temperature);
        }
        if (convertion==4){
            System.out.println(reel+" degré Celcius est égal à "+Temperature.CelsuisVersFarenheit(reel)+"° Farenheit" + Temperature);
        }
        if (convertion==5){
            System.out.println(reel+" degré Kelvin est égal à "+Temperature.KelvinVersFarenheit(reel)+"° Farenheit" + Temperature);
        }
        if (convertion==6){
            System.out.println(reel + " degré Farenheit est égal à " + Temperature.FarenheitVersKelvin(reel)+"° Kelvin" + Temperature);
        }
        if (convertion != 1 && convertion != 2 && convertion != 3 && convertion!=4 && convertion!=5 && convertion!=6){
            break;
        }
        
        }
    }
}
