/*
    SP4: Console
    LAJOUS Malô & ROUBAUD Mathieu
    Novembre 2021
 */
package sp4_console_lajous._roubaud;

/**
 *
 * @author malol
 */
public class SP4_console_LAJOUS_ROUBAUD {


    public static void main(String[] args) {
        Jeton Jtest;
        Jtest = new Jeton("jaune");
        
        Cellule Ctest = new Cellule();
        System.out.println(Ctest.lireCouleurDuJeton());
        boolean verif = Ctest.affecterJeton(Jtest);
        System.out.println(verif);
        System.out.println(Ctest.lireCouleurDuJeton());
        
        verif = Ctest.affecterJeton(Jtest);
        System.out.println(verif);
        System.out.println(Ctest.lireCouleurDuJeton());
    }
    
}
