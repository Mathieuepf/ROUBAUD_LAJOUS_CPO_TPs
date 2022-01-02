/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_roubaud;


/**
 *
 * @author ROUBAUD Mathieu
 */
public class Jeton {
    String couleur = "nd"; //rouge = 0, blanc = 1, jaune = 2, vert = 3, bleu = 4, noir = 5
    
    public Jeton(String c){
        couleur = c;
    }
    
    public Jeton(int a){
        if(a == 0){
            couleur = "rouge";
        }
        if(a == 1){
            couleur = "blanc";
        }
        if(a == 2){
            couleur = "jaune";
        }
        if(a == 3){
            couleur = "vert";
        }
        if(a == 4){
            couleur = "bleu";
        }
        if(a == 5){
            couleur = "noir";
        }
    }
    
    public int chiffreAcouleur(){
        switch(couleur){
            case "rouge":
                return 0;
            case "blanc":
                return 1;
            case "jaune":
                return 2;
            case "vert":
                return 3;
            case "bleu":
                return 4;
            case "noir":
                return 5;
            default:
                return 10;
        }
    }
}
