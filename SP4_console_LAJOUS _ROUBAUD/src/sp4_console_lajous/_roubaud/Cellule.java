/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lajous._roubaud;

import java.util.Random;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    
    public Cellule(){
        
    }
    
    public boolean affecterJeton(Jeton JetonEntree){
        if(jetonCourant == null){
            jetonCourant = JetonEntree;
            return true;
        }else{
            return false;
        }
    }
    
    public String lireCouleurDuJeton(){
        if(jetonCourant != null){
            return jetonCourant.Couleur;
        }else{
            return("nd");
        }
    }
    
    public boolean placerTrouNoir (){
        if (trouNoir){
            return false;
        }
        else{
            trouNoir=true;   
            return true;
        }
    }
    
    public boolean presenceTrouNoir (){
        if (trouNoir){
            return true;
        }
        else{   
            return false;
        }
    }
    
    public boolean activerTrouNoir (){
        
    }
}
