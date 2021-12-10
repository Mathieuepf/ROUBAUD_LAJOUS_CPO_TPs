/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_roubaud;

import java.util.Random;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Ordinateur {
    Jeton [] Wcombine = new Jeton[4];
    
    public void creerUneCombinaison(){
        for(int i=0 ; i<4 ; i++){
            int Rand = new Random().nextInt(5);
            Wcombine[i] = new Jeton(Rand);
        }
    }
}
