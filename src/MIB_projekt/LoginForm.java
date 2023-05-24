/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIB_projekt;


import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;



import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author antti
 */
public class LoginForm extends javax.swing.JFrame {
    
    private static InfDB idb;
    // Create a connection to the database

    /**
     * Creates new form LoginForm
     * @param iidb
     */
    public LoginForm(InfDB iidb) {
        initComponents();
        idb = iidb;
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        userNameField = new javax.swing.JTextField();
        comboLogin = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ChangePasswordButton = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        comboLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Agent", "Alien" }));
        comboLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLoginActionPerformed(evt);
            }
        });

        jLabel1.setText("Username:");

        jLabel2.setText("Password:");

        jLabel3.setText("YOUR TYPE:");

        ChangePasswordButton.setText("Change password");
        ChangePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ChangePasswordButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(passwordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(ChangePasswordButton))
                .addGap(37, 37, 37))
        );

        userNameField.getAccessibleContext().setAccessibleName("");
        userNameField.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String selectedType = comboLogin.getSelectedItem().toString();
        String usernameString = userNameField.getText();
        char[] charPassword = passwordField.getPassword();
        String passwordString = new String(charPassword);

        if (selectedType.equals("Admin")) {
            // Kontrollera om användarnamn eller lösenord är tomma och visa felmeddelande-dialogruta om så är fallet
            if (usernameString.isEmpty() || passwordString.isEmpty()) {
                JOptionPane.showMessageDialog(this, "You must enter a username as well as a password. Try again!");
            }

            try {
                // Hämta lösenordet för agenten baserat på angivet användarnamn
                String sqlQuestion = "SELECT Losenord from agent where Epost = '" + usernameString + "'";
                // Hämta agentens ID baserat på angivet användarnamn
                String getAgentID = "SELECT Agent_ID from agent where Epost = '" + usernameString + "'";
                // Hämta agentens ID som en sträng
                String agentID = idb.fetchSingle(getAgentID);
                // Hämta agentens administratorstatus baserat på agentens ID
                String sqlQuestionAdmin = "SELECT Administrator from agent WHERE Agent_ID = " + agentID;
                // Hämta svaren på SQL-frågorna
                String sqlAnswerP = idb.fetchSingle(sqlQuestion);
                String sqlAnswerA = idb.fetchSingle(sqlQuestionAdmin);

                // Kontrollera om angivet lösenord matchar det hämtade lösenordet och om agenten är administratör
                if (passwordString.equals(sqlAnswerP) && sqlAnswerA.equals("J")) {
                    dispose();
                    // Öppna administratörens startsida
                    AdminHomePage adminHome = new AdminHomePage(idb);
                    adminHome.setVisible(true);
                }

                // Kontrollera om angivet lösenord matchar det hämtade lösenordet men agenten är inte administratör
                if (passwordString.equals(sqlAnswerP) && sqlAnswerA.equals("N")) {
                    JOptionPane.showMessageDialog(this, "You are not an administrator, please select Agent as login type");
                }

                // Kontrollera om angivet lösenord inte matchar det hämtade lösenordet
                if (!passwordString.equals(sqlAnswerP)) {
                    JOptionPane.showMessageDialog(this, "Username or password is incorrect!");
                }

            } catch (InfException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (selectedType.equals("Agent")) {
            // Kontrollera om användarnamn eller lösenord är tomma och visa felmeddelande-dialogruta om så är fallet
            if (usernameString.isEmpty() || passwordString.isEmpty()) {
                JOptionPane.showMessageDialog(this, "You must enter a username as well as a password. Try again!");
            }

            try {
                // Hämta lösenordet för agenten baserat på angivet användarnamn
                String sqlQuestion = "Select Losenord from agent where Epost = '" + usernameString + "'";
                // Hämta svaret på SQL-frågan
                String sqlAnswer = idb.fetchSingle(sqlQuestion);

                // Kontrollera om angivet lösenord matchar det hämtade lösenordet
                if (passwordString.equals(sqlAnswer)) {
                    dispose();
                    // Öppna agentens startsida
                    AgentHomePage agentPage = new AgentHomePage(idb);
                    agentPage.setVisible(true);
                }

                if (!passwordString.equals(sqlAnswer)) {
                    JOptionPane.showMessageDialog(this, "Username or password is incorrect!");
                }
                // Kontrollera om angivet lösenord inte matchar det hämtade lösenordet
                // Visa felmeddelande-dialogruta om användarnamn eller lösenord är inkorrekta

            } catch (InfException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


            if (selectedType.equals("Alien")) { // om alien är vald i comboboxen körs denna kod 
                String alienUser = userNameField.getText();
                char[] alienPassChar = passwordField.getPassword();
                String alienPassword = new String(alienPassChar);

                if (alienUser.isEmpty() || alienPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You must enter an username as well as a password. Try again!");
                }
                // Kontrollera om användarnamn eller lösenord för Alien är tomma och visa felmeddelande-dialogruta om så är fallet

                try {
                    String sqlQuestionAlien = "SELECT Losenord from alien WHERE Epost = '" + usernameString + "'";
                    String sqlAnswerAlien = idb.fetchSingle(sqlQuestionAlien);

                    if (passwordString.equals(sqlAnswerAlien)) {
                        LoginForm.this.dispose();
                        AlienHomePage alienHomeP = new AlienHomePage(idb);
                        alienHomeP.setVisible(true);
                    }
                    // Kontrollera om angivet lösenord matchar det hämtade Alien-lösenordet
                    // Öppna AlienHomePage-fönstret om lösenordet är korrekt

                    if (!passwordString.equals(sqlAnswerAlien)) {
                        JOptionPane.showMessageDialog(this, "Username or password is incorrect!");
                    }
                    // Visa felmeddelande-dialogruta om angivet lösenord inte matchar det hämtade Alien-lösenordet

                } catch (InfException ex) {
                    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
      
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
       
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void comboLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLoginActionPerformed
        // create a new combobox

        
    }//GEN-LAST:event_comboLoginActionPerformed

    private void ChangePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordButtonActionPerformed
        ChangePasswordButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        // skapa en ny instans av changepassword
        ChangePasswordFrame changePasswordFrame = new ChangePasswordFrame(idb);
        changePasswordFrame.setVisible(true); // Visa nya framen
    }
});

    }//GEN-LAST:event_ChangePasswordButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
     
            @Override
            public void run() {
                new LoginForm(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePasswordButton;
    private javax.swing.JComboBox<String> comboLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
