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
    boolean desintegrateur;
    
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
        return trouNoir;
    }
    public boolean activerTrouNoir (){
        if (trouNoir){
            jetonCourant=null;
            trouNoir=true; 
            return true;
        }
        else{
            return false;
        }
    }
    public Jeton recupererJeton(){
        return jetonCourant;
    }
    public boolean supprimerJeton(){
        if (jetonCourant!=null){
            return false;
        }
        else{
            jetonCourant=null;
            return true;
        }
    }
    public boolean placerDesintegrateur (){
        if (desintegrateur){
            return false;
        }
        else{
            desintegrateur=true;   
            return true;
        }
    }
    public boolean presenceDesintegrateur (){
        if (desintegrateur){
            return true;
        }
        else{   
            return false;
        }
    }
    public boolean recupererDesingrateur (){
        if (desintegrateur){
            desintegrateur=false;
            return true;
        }
        else{
            return false;
        }
    }
}
