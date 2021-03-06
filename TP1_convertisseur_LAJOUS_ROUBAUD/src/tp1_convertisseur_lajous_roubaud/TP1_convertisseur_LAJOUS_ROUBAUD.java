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
        //  Téléchargement Scanner
        Scanner sc;
        sc = new Scanner(System.in);
        
        //  Déclaration variables:
        double reel=0;
        int convertion=0;
        
        //  Commandes globales
        System.out.println("Bonjour, saisissez une valeur :");
        reel=sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :"
                + "1) De Celcius vers Kelvin"
                + "2) De Kelvin vers Celcius"
                + "3) De Farenheit vers Celcius"
                + "4) De Celcius vers Farenheit"
                + "5) De Kelvin vers Farenheit"
                + "6) De Farenheit vers Kelvin");
        convertion=sc.nextInt();
        
        if (convertion==1){
            System.out.println(reel+"degré Celcius est égal à "+CelciusVersKelvin(reel)+"° Kelvin");
        }
        if (convertion==2){
            System.out.println(reel+"degré Kelvin est égal à "+KelvinVersCelcius(reel)+"° Celcius");
        }
        if (convertion==3){
            System.out.println(reel+"degré Farenheit est égal à "+FarenheitVersCelcius(reel)+"° Celcius");
        }
        if (convertion==4){
            System.out.println(reel+"degré Celcius est égal à "+CelciusVersFarenheit(reel)+"° Farenheit");
        }
        if (convertion==5){
            System.out.println(reel+"degré Kelvin est égal à "+KelvinVersFarenheit(reel)+"° Farenheit");
        }
        if (convertion==6){
            System.out.println(reel+"degré Farenheit est égal à "+FarenheitVersKelvin(reel)+"° Kelvin");
        }
        
    }
    public static double CelciusVersKelvin(double tempCelcius){
        //Déclaration variables:
        double tempKelvin=0;
        tempKelvin=tempCelcius+273.15;
        return tempKelvin;
    }
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
