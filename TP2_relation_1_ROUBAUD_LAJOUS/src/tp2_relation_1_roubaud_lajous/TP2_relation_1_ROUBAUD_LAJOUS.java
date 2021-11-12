/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_roubaud_lajous;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class TP2_relation_1_ROUBAUD_LAJOUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 60 ) ; 
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 110 ) ; 
        Voiture une2008 = new Voiture ("2008", "Peugeot", 120 ) ; 
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 200 ) ; 
 
        Personne bob = new Personne("Bobby", "Sixkiller"); 
        Personne reno = new Personne("Reno", "Raines");
        
        //bob.liste_voitures[0] = uneClio;
        //bob.nbVoitures = 1 ;
        
        //uneClio.proprietaire = bob;
 
        //System.out.println("liste des voitures disponibles "+ uneClio  + "\n" + uneAutreClio   + "\n" + une2008   + "\n" + uneMicra );
        //System.out.println("la première voiture de bob est "+bob.liste_voitures[0]);
        
        //bob.nbVoitures = 2;
        //bob.liste_voitures[bob.nbVoitures - 1] = uneMicra;
        
        //uneMicra.proprietaire = bob;
        
        //System.out.println("la deuxième voiture de bob est "+bob.liste_voitures[bob.nbVoitures - 1]);
        
        //reno.nbVoitures = 2;
        //reno.liste_voitures[0] = uneAutreClio;
        //reno.liste_voitures[1] = une2008;
        
        //System.out.println("les deux voitures de reno sont "+reno.liste_voitures[0]+" et "+reno.liste_voitures[1]);
        
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneMicra);
        bob.ajouter_voiture(uneAutreClio);
        bob.ajouter_voiture(une2008);
        System.out.println("voitures de " + bob + " : " + bob.liste_voitures[0] + " , " + bob.liste_voitures[1] + " , " + bob.liste_voitures[2]);
        
        reno.ajouter_voiture(uneMicra);
        reno.ajouter_voiture(une2008);
        System.out.println(uneMicra.proprietaire);
        System.out.println("voiture de " + reno + " : " + reno.liste_voitures[0]);
    }
    
}
