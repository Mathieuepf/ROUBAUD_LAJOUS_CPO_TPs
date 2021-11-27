/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sp4_console_lajous._roubaud;

import java.util.Random;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class fenetreDeJeu extends javax.swing.JFrame {

    Joueur[] ListeJoueur = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        panneau_info_joueur.setVisible(false);
        panneau_info_partie.setVisible(false);

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(grilleJeu.CellulesJeu[i][j]);
                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        Cellule c = cellGraph.celluleAssociee;
                        if (c.jetonCourant == null) {
                            return;
                        } else if (c.jetonCourant.Couleur == joueurCourant.Couleur) {
                            message.setText("Le joueur " + joueurCourant.nom + " récupère un de ses jetons");
                            Jeton jrecup = c.recupererJeton();
                            joueurCourant.ajouterJeton(jrecup);
                            c.supprimerJeton();
                            joueurSuivant();
                        } else {
                            if (joueurCourant.nombreDesintegrateurs > 0) {
                                message.setText("Le joueur" + joueurCourant.nom + "désintégre un jeton");
                                c.supprimerJeton();
                                joueurCourant.nombreDesintegrateurs--;
                                joueurSuivant();
                            } else {
                                return;
                            }
                        }
                        for (int i = 0; i < 7; i++) {
                            grilleJeu.tasserGrille(i);
                            System.out.println("grille tassé en " + i);
                        }

                        panneau_grille.repaint();
                        boolean vJ1 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]);
                        boolean vJ2 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]);

                        if (vJ1 && vJ2) {
                            joueurSuivant();
                            message.setText("Victoire de " + joueurCourant.nom + " faute de jeu du joueur adverse");
                        } else if (vJ1) {
                            message.setText("Victoire de " + ListeJoueur[0].nom);
                        } else if (vJ2) {
                            message.setText("Victoire de " + ListeJoueur[1].nom);
                        }

                    }
                });
                panneau_grille.add(cellGraph);
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

        panneau_grille = new javax.swing.JPanel();
        panneau_creation_partie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur_2 = new javax.swing.JTextField();
        nom_joueur_1 = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        panneau_info_joueur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_j1_couleur = new javax.swing.JLabel();
        lbl_j1_nom = new javax.swing.JLabel();
        lbl_j1_desint = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_j2_couleur = new javax.swing.JLabel();
        lbl_j2_nom = new javax.swing.JLabel();
        lbl_j2_desint = new javax.swing.JLabel();
        panneau_info_partie = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_jcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        btn_col_5 = new javax.swing.JButton();
        btn_col_0 = new javax.swing.JButton();
        btn_col_1 = new javax.swing.JButton();
        btn_col_2 = new javax.swing.JButton();
        btn_col_3 = new javax.swing.JButton();
        btn_col_4 = new javax.swing.JButton();
        btn_col_6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(255, 255, 255));
        panneau_grille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 672, 576));

        panneau_creation_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_creation_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nom joueur 2 :");
        panneau_creation_partie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Nom joueur 1 :");
        panneau_creation_partie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        panneau_creation_partie.add(nom_joueur_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));
        panneau_creation_partie.add(nom_joueur_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 130, -1));

        btn_start.setText("Lancer Partie");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_creation_partie.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 140, -1));

        getContentPane().add(panneau_creation_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 250, 120));

        panneau_info_joueur.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Infos joueurs");
        panneau_info_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setText("desintegrateurs ; ");
        panneau_info_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setText("joueur 1 :");
        panneau_info_joueur.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setText("couleur :");
        panneau_info_joueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lbl_j1_couleur.setText("couleurJoueur1");
        panneau_info_joueur.add(lbl_j1_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        lbl_j1_nom.setText("nomJoueur1");
        panneau_info_joueur.add(lbl_j1_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        lbl_j1_desint.setText("nbDesintJoueur1");
        panneau_info_joueur.add(lbl_j1_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));
        panneau_info_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 112, 230, 10));

        jLabel7.setText("desintegrateurs ; ");
        panneau_info_joueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel8.setText("joueur 2 :");
        panneau_info_joueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel9.setText("couleur :");
        panneau_info_joueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        lbl_j2_couleur.setText("couleurJoueur2");
        panneau_info_joueur.add(lbl_j2_couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        lbl_j2_nom.setText("nomJoueur2");
        panneau_info_joueur.add(lbl_j2_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        lbl_j2_desint.setText("nbDesintJoueur2");
        panneau_info_joueur.add(lbl_j2_desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        getContentPane().add(panneau_info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 250, 250));

        panneau_info_partie.setBackground(new java.awt.Color(204, 255, 204));
        panneau_info_partie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Infos jeu");
        panneau_info_partie.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setText("joueur couant :");
        panneau_info_partie.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        lbl_jcourant.setText("nomJoueur1");
        panneau_info_partie.add(lbl_jcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneau_info_partie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 50));

        getContentPane().add(panneau_info_partie, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 250, 130));

        btn_col_5.setText("6");
        btn_col_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        btn_col_0.setText("1");
        btn_col_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btn_col_1.setText("2");
        btn_col_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 10, -1, -1));

        btn_col_2.setText("3");
        btn_col_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 10, -1, -1));

        btn_col_3.setText("4");
        btn_col_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 10, -1, -1));

        btn_col_4.setText("5");
        btn_col_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 10, -1, -1));

        btn_col_6.setText("7");
        btn_col_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_col_6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_col_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 10, -1, -1));

        setBounds(0, 0, 1044, 692);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_col_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_2ActionPerformed
        jouerDansColonne(2);
        joueurSuivant();
        if (grilleJeu.celluleOccupee(5, 2)) {
            btn_col_2.setEnabled(false);
        }
    }//GEN-LAST:event_btn_col_2ActionPerformed

    private void btn_col_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_1ActionPerformed
        jouerDansColonne(1);
        joueurSuivant();
        if (grilleJeu.celluleOccupee(5, 1)) {
            btn_col_1.setEnabled(false);
        }
    }//GEN-LAST:event_btn_col_1ActionPerformed

    private void btn_col_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_4ActionPerformed
        jouerDansColonne(4);
        joueurSuivant();
        if (grilleJeu.celluleOccupee(5, 4)) {
            btn_col_4.setEnabled(false);
        }
    }//GEN-LAST:event_btn_col_4ActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_info_joueur.setVisible(true);
        panneau_info_partie.setVisible(true);
        initialiserPartie();
        panneau_grille.repaint();
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_col_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_0ActionPerformed
        jouerDansColonne(0);
        joueurSuivant();
        if (grilleJeu.celluleOccupee(5, 0)) {
            btn_col_0.setEnabled(false);
        }


    }//GEN-LAST:event_btn_col_0ActionPerformed

    private void btn_col_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_3ActionPerformed
        jouerDansColonne(3);
        joueurSuivant();
        if (grilleJeu.celluleOccupee(5, 3)) {
            btn_col_3.setEnabled(false);
        }
    }//GEN-LAST:event_btn_col_3ActionPerformed

    private void btn_col_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_5ActionPerformed
        jouerDansColonne(5);
        joueurSuivant();
        if (grilleJeu.celluleOccupee(5, 5)) {
            btn_col_5.setEnabled(false);
        }
    }//GEN-LAST:event_btn_col_5ActionPerformed

    private void btn_col_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_col_6ActionPerformed
        jouerDansColonne(6);
        joueurSuivant();
        if (grilleJeu.celluleOccupee(5, 6)) {
            btn_col_6.setEnabled(false);
        }
    }//GEN-LAST:event_btn_col_6ActionPerformed

    public boolean jouerDansColonne(int indiceColonne) {
        //utilisation d'un jeton dans la case
        joueurCourant.nombreJetonsRestants -= 1;

        //effet du jeton sur la partie
        boolean place = grilleJeu.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants], indiceColonne);

        boolean vJ1 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[0]);
        boolean vJ2 = grilleJeu.etreGagnantePourJoueur(ListeJoueur[1]);

        if (vJ1 && vJ2) {
            joueurSuivant();
            message.setText("Victoire de " + joueurCourant.nom + " faute de jeu du joueur adverse");
        } else if (vJ1) {
            message.setText("Victoire de " + ListeJoueur[0].nom);
        } else if (vJ2) {
            message.setText("Victoire de " + ListeJoueur[1].nom);
        }

        if (place) {

            //Verification activation trou noir et désintégrateur
            for (int i = 0; i < 6; i++) {
                if (grilleJeu.CellulesJeu[i][indiceColonne].presenceDesintegrateur() && grilleJeu.CellulesJeu[i][indiceColonne].jetonCourant != null) {
                    grilleJeu.CellulesJeu[i][indiceColonne].recupererDesingrateur();
                    joueurCourant.obtenirDesintegrateur();
                    lbl_j1_desint.setText(ListeJoueur[0].nombreDesintegrateurs + "");
                    lbl_j2_desint.setText(ListeJoueur[1].nombreDesintegrateurs + "");
                    grilleJeu.tasserGrille(indiceColonne);
                }
                if (grilleJeu.CellulesJeu[i][indiceColonne].presenceTrouNoir() && grilleJeu.CellulesJeu[i][indiceColonne].jetonCourant != null) {
                    grilleJeu.CellulesJeu[i][indiceColonne].activerTrouNoir();
                    grilleJeu.tasserGrille(indiceColonne);
                }
            }
            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants] = null;
        } //cas colonne remplie
        else {
            joueurCourant.nombreJetonsRestants += 1;
        }

        panneau_grille.repaint();
        return place;
    }

    public void joueurSuivant() {
        if (joueurCourant == ListeJoueur[0]) {
            joueurCourant = ListeJoueur[1];
        } else {
            joueurCourant = ListeJoueur[0];
        }
        lbl_jcourant.setText(joueurCourant.nom);
    }

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
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }

    public void attribuerCouleursAuxJoueurs() {
        if (new Random().nextInt(2) == 1) {
            ListeJoueur[0].Couleur = "jaune";
            ListeJoueur[1].Couleur = "rouge";
        } else {
            ListeJoueur[1].Couleur = "jaune";
            ListeJoueur[0].Couleur = "rouge";
        }
    }

    public void initialiserPartie() {

        //Créations des joueurs
        String nomJoueur1 = nom_joueur_1.getText();
        Joueur J1 = new Joueur(nomJoueur1);

        String nomJoueur2 = nom_joueur_2.getText();
        Joueur J2 = new Joueur(nomJoueur2);

        ListeJoueur[0] = J1;
        ListeJoueur[1] = J2;

        //attribution des couleurs
        attribuerCouleursAuxJoueurs();

        //affichage des noms sur l'interface
        lbl_j1_nom.setText(nomJoueur1);
        lbl_j2_nom.setText(nomJoueur2);

        //affichage des couleurs des joueurs sur l'interface
        lbl_j1_couleur.setText(J1.Couleur);
        lbl_j2_couleur.setText(J2.Couleur);

        //affichage du nombre de désintégrateurs
        lbl_j1_desint.setText(J1.nombreDesintegrateurs + "");
        lbl_j2_desint.setText(J2.nombreDesintegrateurs + "");

        //Création des jetons
        for (int i = 0; i < 21; i++) {
            Jeton JetonJ1 = new Jeton(ListeJoueur[0].Couleur);
            ListeJoueur[0].ajouterJeton(JetonJ1);
            Jeton JetonJ2 = new Jeton(ListeJoueur[1].Couleur);
            ListeJoueur[1].ajouterJeton(JetonJ2);
        }

        //Placement des trous noirs
        int i = 0;
        while (i < 5) {
            int colonne = new Random().nextInt(7);
            int ligne = new Random().nextInt(6);
            if (grilleJeu.CellulesJeu[ligne][colonne].presenceTrouNoir() == false) {
                grilleJeu.CellulesJeu[ligne][colonne].placerTrouNoir();
                i += 1;
            }
        }

        //Placement désintegrateurs
        //Placement des desintegrateurs visibles
        i = 0;
        while (i < 3) {
            int colonne = new Random().nextInt(7);
            int ligne = new Random().nextInt(6);
            if (grilleJeu.CellulesJeu[ligne][colonne].presenceTrouNoir() == false && grilleJeu.CellulesJeu[ligne][colonne].presenceDesintegrateur() == false) {
                grilleJeu.CellulesJeu[ligne][colonne].placerDesintegrateur();
                i += 1;
            }
        }

        //Placement des desintegrateurs sur trous noirs
        int T1 = new Random().nextInt(5);
        int T2 = new Random().nextInt(5);
        while (T1 == T2) {
            T2 = new Random().nextInt(5);
        }
        int compteur = 0;
        for (i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (grilleJeu.CellulesJeu[i][j].presenceTrouNoir()) {
                    compteur += 1;
                    if (compteur == T1 || compteur == T2) {
                        grilleJeu.CellulesJeu[i][j].placerDesintegrateur();
                    }
                }
            }
        }

        //Rajouter Joueur courant aléatoire
        joueurCourant = ListeJoueur[0];
        lbl_jcourant.setText(joueurCourant.nom);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_col_0;
    private javax.swing.JButton btn_col_1;
    private javax.swing.JButton btn_col_2;
    private javax.swing.JButton btn_col_3;
    private javax.swing.JButton btn_col_4;
    private javax.swing.JButton btn_col_5;
    private javax.swing.JButton btn_col_6;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_j1_couleur;
    private javax.swing.JLabel lbl_j1_desint;
    private javax.swing.JLabel lbl_j1_nom;
    private javax.swing.JLabel lbl_j2_couleur;
    private javax.swing.JLabel lbl_j2_desint;
    private javax.swing.JLabel lbl_j2_nom;
    private javax.swing.JLabel lbl_jcourant;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nom_joueur_1;
    private javax.swing.JTextField nom_joueur_2;
    private javax.swing.JPanel panneau_creation_partie;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JPanel panneau_info_joueur;
    private javax.swing.JPanel panneau_info_partie;
    // End of variables declaration//GEN-END:variables
}
