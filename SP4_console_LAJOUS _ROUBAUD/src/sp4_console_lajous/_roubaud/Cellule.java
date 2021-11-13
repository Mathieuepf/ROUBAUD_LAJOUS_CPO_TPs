/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lajous._roubaud;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Cellule {
    Jeton jetonCourant;
    
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
        return jetonCourant.Couleur;
    }
}
