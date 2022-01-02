/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mastermind_roubaud;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class FenetreDeJeu extends javax.swing.JFrame {
    
    Joueur player;
    GrilleJeton grilleJeu = new GrilleJeton();
    GrilleJeuReponse grilleRep = new GrilleJeuReponse();
    
    public FenetreDeJeu() {
        initComponents();
        
        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<12 ; j++){
                JetonGraphique jetonG = new JetonGraphique();
                panneauJeu.add(jetonG);
            }
        }
        
        for(int i=0 ; i<4 ; i++){
            for(int j=0 ; j<12 ; j++){
                JetonGraphique jetonR = new JetonGraphique();
                panneauReponse.add(jetonR);
            }
        }
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
        jLabel3 = new javax.swing.JLabel();
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
        RetirP = new javax.swing.JButton();
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

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("12");

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
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabel3))
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

        butRouge.setBackground(new java.awt.Color(255, 51, 51));
        butRouge.setText("Rouge");
        butRouge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        butVert.setBackground(new java.awt.Color(0, 204, 51));
        butVert.setText("Vert");
        butVert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        butBlanc.setBackground(new java.awt.Color(255, 255, 255));
        butBlanc.setForeground(new java.awt.Color(0, 0, 0));
        butBlanc.setText("Blanc");
        butBlanc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        RetirP.setText("Retirer Pion");
        RetirP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                            .addComponent(RetirP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(RetirP)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_butJauneActionPerformed

    private void butNoirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNoirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butNoirActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RetirP;
    private javax.swing.JLabel Titre;
    private javax.swing.JButton butBlanc;
    private javax.swing.JButton butBleu;
    private javax.swing.JButton butJaune;
    private javax.swing.JButton butNoir;
    private javax.swing.JButton butRouge;
    private javax.swing.JButton butVert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panneauCommandeJeu;
    private javax.swing.JPanel panneauInfoJeu;
    private javax.swing.JPanel panneauJeu;
    private javax.swing.JPanel panneauReponse;
    private javax.swing.JButton valid;
    // End of variables declaration//GEN-END:variables
}
