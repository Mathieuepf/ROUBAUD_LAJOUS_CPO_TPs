/*
 
*/
package tp1_stats_lajous_roubaud;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author malol
 */
public class TP1_stats_LAJOUS_ROUBAUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Modules
        Scanner sc;
        sc = new Scanner (System.in);
        Random ta=new Random();
        
        //  Intialisation variables
        float tab []=new float[6];
        int m=0;
        int face=ta.nextInt(6);
        
        //  Instruction
        System.out.println("Veuillez saisir une nombre entier:...");
        m=sc.nextInt();
        
        for (int i=0; i<m; i++){
            face=ta.nextInt(6);
            tab[face]=tab[face]+1;
        }
        for(int a=0; a<6;a++){
            System.out.println("La face "+(a+1)+" est tombée "+tab[a]+" fois.\n"
                    + "Sois un rapport de "+tab[a]/m+" % sur "+m+" lancer.\n");
        }
    }
    
}
