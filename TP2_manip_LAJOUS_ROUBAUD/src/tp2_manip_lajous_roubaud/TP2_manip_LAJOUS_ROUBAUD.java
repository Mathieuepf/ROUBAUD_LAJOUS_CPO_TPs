/*
    TP2 Ex 3 : Manipulation
    LAJOUS Malô & ROUBAUD Mathieu
    Octobre 2021
*/
package tp2_manip_lajous_roubaud;

/**
 *
 * @author malol
 */
public class TP2_manip_LAJOUS_ROUBAUD {

    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        
        System.out.println(assiette2.nbCalories);
        System.out.println(assiette3.nbCalories);
        // S'affiche 600 et 600
        assiette2.nbCalories=5;
        
        System.out.println(assiette2.nbCalories);
        System.out.println(assiette3.nbCalories);
        //S'affiche 5 et 5
        
        assiette3.nbCalories=6;
        
        System.out.println(assiette2.nbCalories);
        System.out.println(assiette3.nbCalories);
        //S'affiche 6 et 6
        // Donc les objets assietteé et assiette3 sont en réalités les mêmes. Toutes modifications portées à un des 2 objets seront effectuées à l'autres.
        
        assiette2.nbCalories=600;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        int a= assiette2.nbCalories;
        assiette2.nbCalories=assiette1.nbCalories;
        assiette1.nbCalories=a;
        
        /*Moussaka assiette666 = assiette1 ;
        Moussaka assiette667 = new Tartiflette() ;*/
        // Aucune de ses lignes n'est correcte. Une référence objet qui n'as aucun rapport avec un type objet ne peut le référencer.
 
        Moussaka ref_moussaka[]=new Moussaka[10];
        for (int i=0; i<10; i++){
            ref_moussaka[i]=new Moussaka(0);
        }
                
                
                

    }
    
}
