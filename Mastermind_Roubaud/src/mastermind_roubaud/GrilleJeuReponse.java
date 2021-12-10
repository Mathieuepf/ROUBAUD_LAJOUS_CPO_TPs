/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_roubaud;

import java.util.ArrayList;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class GrilleJeuReponse {
    JetonReponse [][] grille = new JetonReponse[4][12];
    String couleur; //rouge ou noir
    int nbTour = 0;
    
    public void PlacementJetonsReponse(JetonReponse[] tabJ){
        ArrayList<JetonReponse> save = new ArrayList<JetonReponse>();
        for(int i=0 ; i<tabJ.length ; i++){
            if(tabJ[i].couleur == couleur){
                save.add(tabJ[i]);
            }  
        }
        
        for(int i=0 ; i<save.size() ; i++){
            grille[i][nbTour] = save.get(i);
        }
    }
}