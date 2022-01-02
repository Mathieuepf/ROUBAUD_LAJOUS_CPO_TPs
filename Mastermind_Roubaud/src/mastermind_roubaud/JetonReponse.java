/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_roubaud;


/**
 *
 * @author ROUBAUD Mathieu
 */
public class JetonReponse {
    String couleur; //rouge ou blanc
    boolean placee; //jeton placee ou non
    
    public JetonReponse(boolean p){
        placee = p;
        if(p){
            couleur = "rouge";
        }else{
            couleur = "blanc";
        }
    }
}
