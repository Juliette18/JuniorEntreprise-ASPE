/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecrans;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Niakulu
 */
public class AcceuilE extends javax.swing.JFrame {

    /**
     * Creates new form AcceuilE
     */
    public AcceuilE() {
        initComponents();
       
        this.setVisible(true);
        listeModelListeConventionsPassee = new DefaultListModel<String>();
        remplirListModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan_Menu = new javax.swing.JPanel();
        pan_Profil = new javax.swing.JPanel();
        lbl_NomUtilisateur = new javax.swing.JLabel();
        lbl_prenomUtilisateur = new javax.swing.JLabel();
        lbl_Img = new javax.swing.JLabel();
        pan_Nav = new javax.swing.JPanel();
        lbl_profil = new javax.swing.JLabel();
        lbl_conventions = new javax.swing.JLabel();
        lbl_accueil = new javax.swing.JLabel();
        bt_Deco = new javax.swing.JButton();
        mainJPanel = new javax.swing.JPanel();
        lb_bjr = new javax.swing.JLabel();
        lb_nomEtudiant = new javax.swing.JLabel();
        lb_missionsEnCours = new javax.swing.JLabel();
        lb_NomMissionEnCours = new javax.swing.JLabel();
        bt_afficherConvention = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bt_listeConvention = new javax.swing.JButton();
        listePanel = new javax.swing.JScrollPane();
        listConventionsPassees = new javax.swing.JList<>();
        lb_pasDeMission = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unagi - Acceuil");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pan_Menu.setBackground(new java.awt.Color(220, 220, 220));
        pan_Menu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pan_Profil.setBackground(new java.awt.Color(255, 255, 255));
        pan_Profil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_NomUtilisateur.setText("lbl_NomUtilisateur");

        lbl_prenomUtilisateur.setText("lbl_prenomUtilisateur");

        lbl_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snake2.png"))); // NOI18N

        javax.swing.GroupLayout pan_ProfilLayout = new javax.swing.GroupLayout(pan_Profil);
        pan_Profil.setLayout(pan_ProfilLayout);
        pan_ProfilLayout.setHorizontalGroup(
            pan_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pan_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_prenomUtilisateur)
                    .addComponent(lbl_NomUtilisateur))
                .addContainerGap())
        );
        pan_ProfilLayout.setVerticalGroup(
            pan_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_ProfilLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_NomUtilisateur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_prenomUtilisateur)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pan_ProfilLayout.createSequentialGroup()
                .addComponent(lbl_Img)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pan_Nav.setBackground(new java.awt.Color(255, 255, 255));
        pan_Nav.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pan_Nav.setPreferredSize(new java.awt.Dimension(300, 500));
        pan_Nav.setVerifyInputWhenFocusTarget(false);

        lbl_profil.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_profil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_profil.setText("Voir Profil");
        lbl_profil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_conventions.setBackground(new java.awt.Color(10, 10, 10));
        lbl_conventions.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_conventions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_conventions.setText("Conventions");
        lbl_conventions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_conventions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_conventionsMouseClicked(evt);
            }
        });

        lbl_accueil.setBackground(new java.awt.Color(10, 10, 10));
        lbl_accueil.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbl_accueil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_accueil.setText("Accueil");
        lbl_accueil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_accueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_accueilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pan_NavLayout = new javax.swing.GroupLayout(pan_Nav);
        pan_Nav.setLayout(pan_NavLayout);
        pan_NavLayout.setHorizontalGroup(
            pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_NavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_profil, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lbl_conventions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_accueil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pan_NavLayout.setVerticalGroup(
            pan_NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_NavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_profil)
                .addGap(20, 20, 20)
                .addComponent(lbl_accueil)
                .addGap(28, 28, 28)
                .addComponent(lbl_conventions)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pan_MenuLayout = new javax.swing.GroupLayout(pan_Menu);
        pan_Menu.setLayout(pan_MenuLayout);
        pan_MenuLayout.setHorizontalGroup(
            pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan_MenuLayout.createSequentialGroup()
                        .addComponent(pan_Profil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(pan_MenuLayout.createSequentialGroup()
                        .addComponent(pan_Nav, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pan_MenuLayout.setVerticalGroup(
            pan_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan_Profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan_Nav, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );

        bt_Deco.setBackground(new java.awt.Color(255, 51, 51));
        bt_Deco.setForeground(new java.awt.Color(255, 255, 255));
        bt_Deco.setText("Déconnexion");
        bt_Deco.setToolTipText("");
        bt_Deco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_DecoActionPerformed(evt);
            }
        });

        mainJPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_bjr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_bjr.setText("Bonjour");

        lb_nomEtudiant.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_nomEtudiant.setText("Nom Etudiant");

        lb_missionsEnCours.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_missionsEnCours.setText("Mission en cours :");

        lb_NomMissionEnCours.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lb_NomMissionEnCours.setText("nom mission");

        bt_afficherConvention.setText("Afficher convention");
        bt_afficherConvention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_afficherConventionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Missions passees : ");

        bt_listeConvention.setText("Voir liste de conventions");
        bt_listeConvention.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_listeConventionActionPerformed(evt);
            }
        });

        listConventionsPassees.setModel(listeModelListeConventionsPassee);
        listePanel.setViewportView(listConventionsPassees);

        lb_pasDeMission.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lb_pasDeMission.setText("Pas de mission passee");
        lb_pasDeMission.setVisible(false);

        javax.swing.GroupLayout mainJPanelLayout = new javax.swing.GroupLayout(mainJPanel);
        mainJPanel.setLayout(mainJPanelLayout);
        mainJPanelLayout.setHorizontalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPanelLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_listeConvention)
                    .addComponent(listePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_pasDeMission))
                    .addComponent(bt_afficherConvention)
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(lb_missionsEnCours)
                        .addGap(18, 18, 18)
                        .addComponent(lb_NomMissionEnCours))
                    .addGroup(mainJPanelLayout.createSequentialGroup()
                        .addComponent(lb_bjr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_nomEtudiant)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        mainJPanelLayout.setVerticalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_bjr)
                    .addComponent(lb_nomEtudiant))
                .addGap(62, 62, 62)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_missionsEnCours)
                    .addComponent(lb_NomMissionEnCours))
                .addGap(18, 18, 18)
                .addComponent(bt_afficherConvention)
                .addGap(45, 45, 45)
                .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lb_pasDeMission))
                .addGap(18, 18, 18)
                .addComponent(bt_listeConvention)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pan_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 602, Short.MAX_VALUE)
                        .addComponent(bt_Deco, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pan_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Deco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_conventionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_conventionsMouseClicked
   //A gérer avec la bd car on ne doit pouvoir afficher que les conventions qui concerne l'étudiant
    }//GEN-LAST:event_lbl_conventionsMouseClicked

    private void lbl_accueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_accueilMouseClicked
       this.setVisible(false);
       AcceuilE acceuilE = new AcceuilE();
       acceuilE.setVisible(true);
    }//GEN-LAST:event_lbl_accueilMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int input = JOptionPane.showConfirmDialog(this, "Voulez vous quitter l'application ?", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (input == JOptionPane.OK_OPTION) {
            System.out.println("Application Fermée");
            this.dispose();
            System.exit(0);
        } else if (input == JOptionPane.CANCEL_OPTION) {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void bt_DecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_DecoActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Voulez vous retourner à l'écran de connexion?", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (input == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            Connexion connexion = new Connexion();
            connexion.setVisible(true);
        } else if (input == JOptionPane.CANCEL_OPTION) {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_bt_DecoActionPerformed

    private void bt_afficherConventionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_afficherConventionActionPerformed
        // code afficher pdf ??
    }//GEN-LAST:event_bt_afficherConventionActionPerformed

    private void bt_listeConventionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_listeConventionActionPerformed
        // get liste de convention de l etudiant from bdd et afficher 
    }//GEN-LAST:event_bt_listeConventionActionPerformed

    public void remplirListModel() 
    {
        //remplir la liste de conventions passees avec les donnees de la BDD
        String[] lesConventionspassees = {"conv1", "conv2", "conv3"}; 
        if(lesConventionspassees.length == 0) {
            listConventionsPassees.setVisible(false);
            lb_pasDeMission.setVisible(true);
            bt_listeConvention.setVisible(false);
        }
        for (String s : lesConventionspassees) {
            listeModelListeConventionsPassee.addElement(s);
        }
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
            java.util.logging.Logger.getLogger(AcceuilE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcceuilE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcceuilE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcceuilE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcceuilE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Deco;
    private javax.swing.JButton bt_afficherConvention;
    private javax.swing.JButton bt_listeConvention;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb_NomMissionEnCours;
    private javax.swing.JLabel lb_bjr;
    private javax.swing.JLabel lb_missionsEnCours;
    private javax.swing.JLabel lb_nomEtudiant;
    private javax.swing.JLabel lb_pasDeMission;
    private javax.swing.JLabel lbl_Img;
    private javax.swing.JLabel lbl_NomUtilisateur;
    private javax.swing.JLabel lbl_accueil;
    private javax.swing.JLabel lbl_conventions;
    private javax.swing.JLabel lbl_prenomUtilisateur;
    private javax.swing.JLabel lbl_profil;
    private javax.swing.JList<String> listConventionsPassees;
    private javax.swing.JScrollPane listePanel;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JPanel pan_Menu;
    private javax.swing.JPanel pan_Nav;
    private javax.swing.JPanel pan_Profil;
    // End of variables declaration//GEN-END:variables
    private DefaultListModel<String> listeModelListeConventionsPassee;

}
