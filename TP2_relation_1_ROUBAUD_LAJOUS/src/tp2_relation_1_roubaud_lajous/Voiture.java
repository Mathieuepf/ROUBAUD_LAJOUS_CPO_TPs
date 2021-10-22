/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_roubaud_lajous;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture(String modele, String marque, int puissance){
        Modele = modele;
        Marque = marque;
        PuissanceCV = puissance;
    }
    
    @Override 
    public String toString() {
        return (Modele +" "+ Marque+" "+PuissanceCV+" chevaux");
    }
}
