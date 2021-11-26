/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_lajous._roubaud;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class CelluleGraphique extends JButton{
    Cellule celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_desint = new javax.swing.ImageIcon(getClass().getResource("/images/desintegrateur.png"));
    ImageIcon img_jaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_rouge = new javax.swing.ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_noir = new javax.swing.ImageIcon(getClass().getResource("/images/trouNoir.png"));
    
    
    public CelluleGraphique(Cellule UneCelulle){
        celluleAssociee = UneCelulle;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        String couleur_jeton = celluleAssociee.lireCouleurDuJeton();
        
        if(celluleAssociee.presenceTrouNoir()){
            setIcon(img_noir);
        }else if(celluleAssociee.presenceDesintegrateur()){
            setIcon(img_desint);
        }else{
            switch(couleur_jeton){
                case "rouge":
                    setIcon(img_rouge);
                case "jaune":
                    setIcon(img_jaune);
                case "nd":
                    setIcon(img_vide); // on attribue l'image celluleVide.png
            }
        }
    }
}
