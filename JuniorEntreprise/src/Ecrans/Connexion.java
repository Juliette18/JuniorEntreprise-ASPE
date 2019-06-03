/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecrans;

import Ecrans.AcceuilA;
import Ecrans.AcceuilE;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;


/**
 *
 * @author p1809164
 */
public class Connexion extends javax.swing.JFrame {
    
    private static String id;
    private static String pw;
    private boolean admin;

    /**
     * Creates new form page2
     */
    public Connexion() {

        initComponents();
        this.setVisible(true);
        GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Rectangle bounds = genv.getMaximumWindowBounds();
        this.setBounds(bounds);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Img = new javax.swing.JLabel();
        lb_Titre = new javax.swing.JLabel();
        lb_Id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lb_Mdp = new javax.swing.JLabel();
        pass_Mdp = new javax.swing.JPasswordField();
        bt_Valider = new javax.swing.JButton();
        lb_Compte = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unagi - Connexion");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lbl_Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snake2.png"))); // NOI18N

        lb_Titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Titre.setText("Bienvenue chez Unagi ! ");

        lb_Id.setText("Identifiant");

        lb_Mdp.setText("Mot de passe");

        bt_Valider.setText("Connexion");
        bt_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ValiderActionPerformed(evt);
            }
        });

        lb_Compte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Compte.setText("Pas de compte ou mot de passe oublié?   Envoyez un mail à JE@ecole.com");
        lb_Compte.setToolTipText("");
        lb_Compte.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Id)
                            .addComponent(lb_Mdp))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id)
                            .addComponent(pass_Mdp, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(lb_Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(bt_Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 295, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lb_Compte, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Img)
                        .addGap(464, 464, 464))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_Img, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Id))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_Mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_Mdp))
                .addGap(93, 93, 93)
                .addComponent(bt_Valider, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(lb_Compte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ValiderActionPerformed
        String I = txt_id.getText(); 
        String M = String.valueOf(pass_Mdp.getPassword());
        boolean out= false;
        String Uti = "" ; //A mettre sur "" qaund le lien à la BD sera fait, sur Admin pour les tests
        PreparedStatement ps;
        ResultSet rs;        
        final String requete = "select * from user";
                //"select emp from user where username = ? and password = ?;";
        
        try {
            
            ps = ConnexionBD.getConnection().prepareStatement(requete);
            /*ps.setString(1,I);
            ps.setString(2,M);
            ps.setBoolean(3,admin);*/
            rs = ps.executeQuery(); 
            
            while (rs.next()){
                if ((rs.getString("username").equals(I))&&rs.getString("password").equals(M)){
                    System.out.println(rs.getString("username"));
                    if (rs.getBoolean("emp")==true){
                        AcceuilA  acceuilA = new AcceuilA();
                        this.setVisible(false);
                        out = true;
                        break;
                    }
                    else {
                        AcceuilE  acceuilE = new AcceuilE();
                        this.setVisible(false);
                        out = true;
                        break;
                    }
                
                }
                
                }
            if (out == false){
            JOptionPane.showMessageDialog(this, "Identifiant ou mot de passe incorrect","Erreur",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        if (M.equals("")||I.equals("")){ 
            JOptionPane.showMessageDialog(this,"Un ou plusieurs champs sont vides", "Erreur de saisie", JOptionPane.INFORMATION_MESSAGE);
        }
        //TODO check dans Database
        //1- Vérif existance due l'identifiant
        //2- Vérif exitence du couple ID/MDp
        //3- Verif type utilisateur
        //Recupération du type d'utilisateur et modif de la var Uti

        
        
         
    }//GEN-LAST:event_bt_ValiderActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    int input = JOptionPane.showConfirmDialog(this, "Voulez vous quitter l'application ?", "", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (input == JOptionPane.OK_OPTION) {
            System.out.println("Application Fermée");
            this.dispose();
            System.exit(0);
        } else if (input == JOptionPane.CANCEL_OPTION) {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Valider;
    private javax.swing.JLabel lb_Compte;
    private javax.swing.JLabel lb_Id;
    private javax.swing.JLabel lb_Mdp;
    private javax.swing.JLabel lb_Titre;
    private javax.swing.JLabel lbl_Img;
    private javax.swing.JPasswordField pass_Mdp;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables


}
