/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_lajous_roubaud;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur () { 
        nbConversions=0 ;
    }
    
    public double CelsiusVersKelvin(double tempCelcius){
        double tempKelvin;
        tempKelvin=tempCelcius+273.15;
        nbConversions += 1;
        return tempKelvin;
    }
    
    public double KelvinVersCelsius(double tempKelvin){
        double tempCelcius;
        tempCelcius=tempKelvin-273.15;
        nbConversions += 1;
        return tempCelcius;
    }
    
    public double FarenheitVersCelsius(double tempFarenheit){
        double tempCelcius;
        tempCelcius=(tempFarenheit-32)*5.0/9.0;
        nbConversions += 1;
        return tempCelcius;
    }
    
    public double CelsuisVersFarenheit(double tempCelcius){
        double tempFarenheit;
        tempFarenheit=tempCelcius*9.0/5.0+32;
        nbConversions += 1;
        return tempFarenheit;
    }
    
    public double FarenheitVersKelvin(double tempFarenheit){
        double tempKelvin;
        tempKelvin=(tempFarenheit+459.67)*5.0/9.0;
        nbConversions += 1;
        return tempKelvin;
    }
    
    public double KelvinVersFarenheit(double tempKelvin){
        double tempFarenheit;
        tempFarenheit=tempKelvin*9.0/5.0-459.67;
        nbConversions += 1;
        return tempFarenheit;
    }
    
    @Override 
    public String toString() {
        return " nb de conversions "+ nbConversions;
    }
}
