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

    /**
     * Creates new form FenetreDeJeu
     */
    public FenetreDeJeu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grilleReponse = new javax.swing.JPanel();
        grilleDejeu = new javax.swing.JPanel();
        infoJeu = new javax.swing.JPanel();
        commandeJeu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grilleReponse.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout grilleReponseLayout = new javax.swing.GroupLayout(grilleReponse);
        grilleReponse.setLayout(grilleReponseLayout);
        grilleReponseLayout.setHorizontalGroup(
            grilleReponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        grilleReponseLayout.setVerticalGroup(
            grilleReponseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(grilleReponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 330, 610));

        grilleDejeu.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout grilleDejeuLayout = new javax.swing.GroupLayout(grilleDejeu);
        grilleDejeu.setLayout(grilleDejeuLayout);
        grilleDejeuLayout.setHorizontalGroup(
            grilleDejeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        grilleDejeuLayout.setVerticalGroup(
            grilleDejeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(grilleDejeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 350, 610));

        infoJeu.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout infoJeuLayout = new javax.swing.GroupLayout(infoJeu);
        infoJeu.setLayout(infoJeuLayout);
        infoJeuLayout.setHorizontalGroup(
            infoJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        infoJeuLayout.setVerticalGroup(
            infoJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        getContentPane().add(infoJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 90, 220, 180));

        commandeJeu.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout commandeJeuLayout = new javax.swing.GroupLayout(commandeJeu);
        commandeJeu.setLayout(commandeJeuLayout);
        commandeJeuLayout.setHorizontalGroup(
            commandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        commandeJeuLayout.setVerticalGroup(
            commandeJeuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(commandeJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 220, 390));

        jLabel1.setText("MASTERMIND");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 230, 60));

        setBounds(0, 0, 1414, 787);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel commandeJeu;
    private javax.swing.JPanel grilleDejeu;
    private javax.swing.JPanel grilleReponse;
    private javax.swing.JPanel infoJeu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
