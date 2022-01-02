/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_roubaud;

import javax.swing.JButton;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class JetonGraphique extends JButton {
    Jeton jetonAssocie;
    JetonReponse jetonRepAsso;
    boolean typeJeton; //Si Jeton : true , si JetonReponse : false
    
    public JetonGraphique(Jeton unJeton){
        jetonAssocie = unJeton;
        typeJeton = true;
    }
    
    public JetonGraphique(JetonReponse unJetonR){
        jetonRepAsso = unJetonR;
        typeJeton = false;
    }
}
