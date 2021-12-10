/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_roubaud_lajous;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class TP2_Bieres_ROUBAUD_LAJOUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        deuxBiere.lireEtiquette();
        
        BouteilleBiere troisBiere = new BouteilleBiere("Grimbergen",6.7,"Abbaye de Grimbergen");
        troisBiere.lireEtiquette();
        
        BouteilleBiere quatreBiere = new BouteilleBiere("Pietra",6.0,"Furiani");
        quatreBiere.lireEtiquette();
        
        BouteilleBiere cinqBiere = new BouteilleBiere("Kronenbourg",7.0,"Obernai");
        cinqBiere.lireEtiquette();
        
        quatreBiere.Decapsuler();
        quatreBiere.Decapsuler();
        
        System.out.println(quatreBiere);
        
        System.out.println(uneBiere);
        
        deuxBiere.Decapsuler();
        System.out.println(deuxBiere);
   }
    
}
