/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_roubaud;

import javax.swing.JButton;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class JetonReponse extends JButton {
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
