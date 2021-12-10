/*
    TP2 Ex 1 : Bieres
    LAJOUS Malô & ROUBAUD Mathieu
    Octobre 2021
*/
package tp2_bieres_lajous_roubaud;

/**
 *
 * @author malol
 */
public class TP2_Bieres_LAJOUS_ROUBAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere =new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        uneBiere.lireEtiquette();
        
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6 , "Abbaye de Leffe");
        secondeBiere.lireEtiquette();        

        BouteilleBiere thirdbeer = new BouteilleBiere ("Heineken", 5.0 , "Brasseries Heineken");
        thirdbeer.lireEtiquette();
        
        BouteilleBiere fourthbeer = new BouteilleBiere ("1664", 5.5 , "Brasserie d'Obernai");
        fourthbeer.lireEtiquette();
        
        BouteilleBiere fifthbeer = new BouteilleBiere ("La Goudale", 7.2, "Brasserie Goudale");
        fifthbeer.lireEtiquette();
        
        System.out.println(fifthbeer.ouverte);
        fifthbeer.Decapsuler();
        System.out.println(fifthbeer.ouverte);
        // S'affiche false puis true donc l'attibut ouverte change bien de valeur grâce à la méthode Decapsuler
        
        System.out.println(uneBiere) ;
        uneBiere.Decapsuler();
        System.out.println(uneBiere);

    }
    
}
