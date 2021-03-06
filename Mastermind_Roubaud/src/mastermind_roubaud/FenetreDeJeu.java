/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind_roubaud;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class FenetreDeJeu extends javax.swing.JFrame {
    
    Ordinateur IA = new Ordinateur();
    GrilleJeton grilleJeu = new GrilleJeton();
    GrilleJeuReponse grilleRep = new GrilleJeuReponse();
    int colonneCourante = 0;
    int nbTours = 0;
    JetonGraphique [][] caseJetons = new JetonGraphique [4][12];
    JetonGraphique [][] caseJetonsRep = new JetonGraphique [4][12];
    
    public FenetreDeJeu() {
        initComponents();
        
        
        
        for(int i=0 ; i<12 ; i++){
            for(int j=0 ; j<4 ; j++){
                JetonGraphique jetonG = new JetonGraphique(grilleJeu.grille[j][i]);
                panneauJeu.add(jetonG);
                caseJetons[j][i] = jetonG;
            }
        }
        
        for(int i=0 ; i<12 ; i++){
            for(int j=0 ; j<4 ; j++){
                JetonGraphique jetonR = new JetonGraphique(grilleRep.grille[j][i]);
                panneauReponse.add(jetonR);
                caseJetonsRep[j][i] = jetonR;
            }
        }
        
        IA.creerUneCombinaison();
        //IA.combinaisonFrance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneauReponse = new javax.swing.JPanel();
        panneauJeu = new javax.swing.JPanel();
        panneauInfoJeu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nbToursGraph = new javax.swing.JLabel();
        panneauCommandeJeu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        butJaune = new javax.swing.JButton();
        butBleu = new javax.swing.JButton();
        butRouge = new javax.swing.JButton();
        butVert = new javax.swing.JButton();
        butBlanc = new javax.swing.JButton();
        butNoir = new javax.swing.JButton();
        valid = new javax.swing.JButton();
        retirP = new javax.swing.JButton();
        Titre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneauReponse.setBackground(new java.awt.Color(153, 153, 255));
        panneauReponse.setLayout(new java.awt.GridLayout(12, 4, 3, 3));
        getContentPane().add(panneauReponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 330, 610));

        panneauJeu.setBackground(new java.awt.Color(153, 153, 255));
        panneauJeu.setLayout(new java.awt.GridLayout(12, 4, 3, 3));
        getContentPane().add(panneauJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 350, 610));

        panneauInfoJeu.setBackground(new java.awt.Color(102, 102, 255));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel2.setText("Informations de jeu");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Nombre d'essaies restants : ");

        nbToursGraph.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        nbToursGraph.setText("12");

        javax.swing.GroupLayout panneauInfoJeuLayout = new javax.swing.GroupLayout(panneauInfoJeu);
        panneauInfoJeu.setLayout(panneauInfoJeuLayout);
        panneauInfoJeuLayout.setHorizontalGroup(
            panneauInfoJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauInfoJeuLayout.createSequentialGroup()
                .addGroup(panneauInfoJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panneauInfoJeuLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panneauInfoJeuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nbToursGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        panneauInfoJeuLayout.setVerticalGroup(
            panneauInfoJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauInfoJeuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panneauInfoJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nbToursGraph))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        getContentPane().add(panneauInfoJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, 220, 180));

        panneauCommandeJeu.setBackground(new java.awt.Color(102, 102, 255));

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel4.setText("Commandes de jeu");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Pions :");

        butJaune.setBackground(new java.awt.Color(255, 255, 51));
        butJaune.setForeground(new java.awt.Color(0, 0, 0));
        butJaune.setText("Jaune");
        butJaune.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butJaune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butJauneActionPerformed(evt);
            }
        });

        butBleu.setBackground(new java.awt.Color(0, 102, 204));
        butBleu.setText("Bleu");
        butBleu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBleu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBleuActionPerformed(evt);
            }
        });

        butRouge.setBackground(new java.awt.Color(255, 51, 51));
        butRouge.setText("Rouge");
        butRouge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butRouge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRougeActionPerformed(evt);
            }
        });

        butVert.setBackground(new java.awt.Color(0, 204, 51));
        butVert.setText("Vert");
        butVert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butVert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVertActionPerformed(evt);
            }
        });

        butBlanc.setBackground(new java.awt.Color(255, 255, 255));
        butBlanc.setForeground(new java.awt.Color(0, 0, 0));
        butBlanc.setText("Blanc");
        butBlanc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butBlanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butBlancActionPerformed(evt);
            }
        });

        butNoir.setBackground(new java.awt.Color(0, 0, 0));
        butNoir.setText("Noir");
        butNoir.setToolTipText("");
        butNoir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butNoir.setRolloverEnabled(true);
        butNoir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoirActionPerformed(evt);
            }
        });

        valid.setText("Valider Combinaison");
        valid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validActionPerformed(evt);
            }
        });

        retirP.setText("Retirer Pion");
        retirP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panneauCommandeJeuLayout = new javax.swing.GroupLayout(panneauCommandeJeu);
        panneauCommandeJeu.setLayout(panneauCommandeJeuLayout);
        panneauCommandeJeuLayout.setHorizontalGroup(
            panneauCommandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panneauCommandeJeuLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(panneauCommandeJeuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panneauCommandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panneauCommandeJeuLayout.createSequentialGroup()
                        .addComponent(butJaune, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butBleu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panneauCommandeJeuLayout.createSequentialGroup()
                        .addComponent(butRouge, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butVert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panneauCommandeJeuLayout.createSequentialGroup()
                        .addComponent(butBlanc, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butNoir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panneauCommandeJeuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panneauCommandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(retirP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panneauCommandeJeuLayout.setVerticalGroup(
            panneauCommandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panneauCommandeJeuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panneauCommandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butJaune)
                    .addComponent(butBleu))
                .addGap(18, 18, 18)
                .addGroup(panneauCommandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butRouge)
                    .addComponent(butVert))
                .addGap(18, 18, 18)
                .addGroup(panneauCommandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butBlanc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butNoir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(retirP)
                .addGap(18, 18, 18)
                .addComponent(valid)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(panneauCommandeJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 220, 390));

        Titre.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        Titre.setText("MASTERMIND");
        getContentPane().add(Titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 170, 60));

        setBounds(0, 0, 1414, 787);
    }// </editor-fold>//GEN-END:initComponents

    private void butJauneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butJauneActionPerformed
        if(colonneCourante < 4){
            Jeton J = new Jeton("jaune");
            grilleJeu.grille[colonneCourante][nbTours] = J;
            miseAJourCase(Color.YELLOW);
            colonneCourante ++;
        }
    }//GEN-LAST:event_butJauneActionPerformed

    private void butNoirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoirActionPerformed
        if(colonneCourante < 4){
            Jeton J = new Jeton("noir");
            grilleJeu.grille[colonneCourante][nbTours] = J;
            miseAJourCase(Color.BLACK);
            colonneCourante ++;
        }
    }//GEN-LAST:event_butNoirActionPerformed

    private void butBleuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBleuActionPerformed
        if(colonneCourante < 4){
            Jeton J = new Jeton("bleu");
            grilleJeu.grille[colonneCourante][nbTours] = J;
            miseAJourCase(Color.BLUE);
            colonneCourante ++;
        }
    }//GEN-LAST:event_butBleuActionPerformed

    private void butRougeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRougeActionPerformed
        if(colonneCourante < 4){
            Jeton J = new Jeton("rouge");
            grilleJeu.grille[colonneCourante][nbTours] = J;
            miseAJourCase(Color.RED);
            colonneCourante ++;
        }
    }//GEN-LAST:event_butRougeActionPerformed

    private void butVertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVertActionPerformed
        if(colonneCourante < 4){
            Jeton J = new Jeton("vert");
            grilleJeu.grille[colonneCourante][nbTours] = J;
            miseAJourCase(Color.GREEN);
            colonneCourante ++;
        }
    }//GEN-LAST:event_butVertActionPerformed

    private void butBlancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butBlancActionPerformed
        if(colonneCourante < 4){
            Jeton J = new Jeton("blanc");
            grilleJeu.grille[colonneCourante][nbTours] = J;
            miseAJourCase(Color.WHITE);
            colonneCourante ++;
        }
    }//GEN-LAST:event_butBlancActionPerformed

    private void retirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirPActionPerformed
        if(colonneCourante > 0){
            colonneCourante -= 1;
            grilleJeu.grille[colonneCourante][nbTours] = null;
            miseAJourCase(Color.lightGray);
        }
    }//GEN-LAST:event_retirPActionPerformed

    private void validActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validActionPerformed
        if(colonneCourante == 4){
            grilleJeu.nbTour += 1;
            grilleRep.nbTour += 1;
            colonneCourante = 0;
            
            if(grilleJeu.grille[0][nbTours].couleur == "bleu" && grilleJeu.grille[1][nbTours].couleur == "blanc" && grilleJeu.grille[2][nbTours].couleur == "blanc" && grilleJeu.grille[3][nbTours].couleur == "rouge"){
                easterEgg();
            }
            
            int [] compteurs = new int[2];
            compteurs = verifCombin();
            
            for(int i=0 ; i<compteurs[0] ; i++){
                caseJetonsRep[i][nbTours].setBackground(Color.red);
            }

            for(int i=0 ; i<compteurs[1] ; i++){
                caseJetonsRep[compteurs[0]+i][nbTours].setBackground(Color.white);
            }
                
            if(compteurs[0] != 4){
                verifFinPartie(false);
            }else{
                verifFinPartie(true);
            }
            
            nbTours += 1;
            nbToursGraph.setText((12-nbTours)+"");
        }        
    }//GEN-LAST:event_validActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }
    
    
    public void miseAJourCase(Color c){
        caseJetons[colonneCourante][nbTours].setBackground(c);
    }
    
    
    public void verifFinPartie(boolean partieFinie){
        if(nbTours == 11 || partieFinie){
            if(partieFinie == false){
                FenetreDeFin newFen = new FenetreDeFin(nbTours+1, false);
                newFen.setVisible(true);
            }else{
                FenetreDeFin newFen = new FenetreDeFin(nbTours+1, true);
                newFen.setVisible(true);
            }
        }
    }
    
    public int[] verifCombin(){
        int compteurRouge = 0; //nombre de jetons biens plac??s
        int compteurBlanc = 0; //nombre de jetons bons dans la combinaison mais mal plac??
        int [] positionBlanc = new int[4]; //rang des jetons d??j?? comptabilis??s comme ??tant mal plac??s
        positionBlanc[0] = 90; //initialisation d??faut du tableau
        positionBlanc[1] = 90;
        positionBlanc[2] = 90;
        positionBlanc[3] = 90;
        int [] compteurs = new int[2];
        
        for(int i=0 ; i<4; i++){
            for(int j=0 ; j<4 ; j++){
                if(grilleJeu.grille[j][nbTours].couleur == IA.Wcombine[i].couleur && positionBlanc[j] != j){
                    positionBlanc[j] = j;
                    compteurBlanc += 1;
                    break;
                }
            }
        }
        
        for(int i=0 ; i<4 ; i++){
            if(grilleJeu.grille[i][nbTours].couleur == IA.Wcombine[i].couleur){
                compteurRouge ++;
            }
        }
        
        compteurBlanc -= compteurRouge;
        
        
        compteurs[0] = compteurRouge;
        compteurs[1] = compteurBlanc;
        
        return compteurs;
    }
    
    public void easterEgg(){
        
        //cr??ation d'une fenetre avec une image
        JFrame easterFrame = new JFrame("Allez le FOOT");
        easterFrame.setPreferredSize(new Dimension(800,600));
        ImageIcon leFoot = new ImageIcon(getClass().getResource("/image/LesBleus.jpg"));
        JLabel labelBleue = new JLabel(leFoot); //et pas la belle bleue
        easterFrame.add(labelBleue);
        easterFrame.pack();
        easterFrame.setVisible(true);
    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titre;
    private javax.swing.JButton butBlanc;
    private javax.swing.JButton butBleu;
    private javax.swing.JButton butJaune;
    private javax.swing.JButton butNoir;
    private javax.swing.JButton butRouge;
    private javax.swing.JButton butVert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nbToursGraph;
    private javax.swing.JPanel panneauCommandeJeu;
    private javax.swing.JPanel panneauInfoJeu;
    private javax.swing.JPanel panneauJeu;
    private javax.swing.JPanel panneauReponse;
    private javax.swing.JButton retirP;
    private javax.swing.JButton valid;
    // End of variables declaration//GEN-END:variables
}
