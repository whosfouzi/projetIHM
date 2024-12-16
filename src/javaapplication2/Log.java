/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;

import org.mindrot.jbcrypt.BCrypt;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author HIGH TECH
 */
public class Log extends javax.swing.JFrame {

    /**
     * Creates new form Log
     */
    public Log() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 0));

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenue");
        jLabel1.setPreferredSize(new java.awt.Dimension(117, 72));
        jPanel4.add(jLabel1);

        jPanel1.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(400, 180));

        jPanel7.setPreferredSize(new java.awt.Dimension(250, 70));
        jPanel7.setLayout(new java.awt.BorderLayout(4, 4));
        jPanel7.add(jTextField2, java.awt.BorderLayout.CENTER);

        jLabel3.setText("Email");
        jPanel7.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setPreferredSize(new java.awt.Dimension(0, 15));
        jPanel7.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel7);

        jPanel6.setPreferredSize(new java.awt.Dimension(250, 75));
        jPanel6.setLayout(new java.awt.BorderLayout(4, 4));

        jLabel2.setText("Mot de passe");
        jPanel6.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jPasswordField1, java.awt.BorderLayout.CENTER);

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(0, 20));
        jPanel6.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel6);

        jPanel8.setPreferredSize(new java.awt.Dimension(250, 20));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jCheckBox1.setText("Se souvenir de moi");
        jPanel8.add(jCheckBox1, java.awt.BorderLayout.WEST);

        jLabel4.setForeground(new java.awt.Color(47, 131, 244));
        jLabel4.setText("Mot de passe oblier?");
        jPanel8.add(jLabel4, java.awt.BorderLayout.EAST);

        jPanel5.add(jPanel8);

        jPanel1.add(jPanel5);

        jPanel9.setPreferredSize(new java.awt.Dimension(400, 50));

        jButton2.setText("Connexion");
        jButton2.setPreferredSize(new java.awt.Dimension(200, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton2);

        jPanel1.add(jPanel9);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication2/2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Get email and password input
        String email = jTextField2.getText();
        String password = new String(jPasswordField1.getPassword());

        jLabel6.setText("");
        jLabel7.setText("");
        

        boolean hasError = false;

        // Validate each field and set corresponding error label if empty
        if (jTextField2.getText().isEmpty()) {
            jLabel6.setText("*Ce champ est obligatoire.");
            hasError = true;
        }
        if (jPasswordField1.getPassword().length==0) {
            jLabel7.setText("*Ce champ est obligatoire.");
            hasError = true;
        }
        

        // If any field has an error, stop execution
        if (hasError) {
            return;
        }

        // Database connection and password verification
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(
                 "SELECT mot_de_passe, role FROM utilisateur WHERE email = ?")) {

            // Set the email in the prepared statement
            stmt.setString(1, email);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String hashedPassword = rs.getString("mot_de_passe");
                    String role = rs.getString("role");

                    // Verify the password using BCrypt
                    if (BCrypt.checkpw(password, hashedPassword)) {


                        // Open the appropriate dashboard based on the user's role
                        switch (role.toLowerCase()) {
                            case "admin":
                                JOptionPane.showMessageDialog(this, "Connexion réussie, Bienvenue" + role);
                                new AdminDashboard().setVisible(true);
                                break;
                            case "gestionnaire":
                                new manager().setVisible(true);
                                break;
                            default:
                                JOptionPane.showMessageDialog(this, "Rôle inconnu : " + role, "Erreur", JOptionPane.ERROR_MESSAGE);
                        }
                        this.dispose(); // Close the login page
                    } else {
                        JOptionPane.showMessageDialog(this, "Mot de passe incorrect.", "Erreur", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Email introuvable.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erreur SQL : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
