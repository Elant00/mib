/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIB_projekt;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author antti
 */
public class ChangeAlienInfo extends javax.swing.JFrame {

  
   private static InfDB idb;
    // Create a connection to the database

    /**
     * Creates new form LoginForm
     * @param iidb
     */
    public ChangeAlienInfo(InfDB iidb) {
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

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        responsibleAgentField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        areaField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        alienIDText = new javax.swing.JTextField();
        changeName = new javax.swing.JButton();
        changeEmail = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();
        changePhone = new javax.swing.JButton();
        changeArea = new javax.swing.JButton();
        changeAgent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Change name:");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Change Email:");

        jLabel3.setText("Change password:");

        jLabel4.setText("Change phonenumber:");

        jLabel5.setText("Change area");

        jLabel6.setText("Change responsible agent");

        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter alienID here:");

        changeName.setText("Confirm change");
        changeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameActionPerformed(evt);
            }
        });

        changeEmail.setText("Confirm change");
        changeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailActionPerformed(evt);
            }
        });

        changePassword.setText("Confirm change");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        changePhone.setText("Confirm change");
        changePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePhoneActionPerformed(evt);
            }
        });

        changeArea.setText("Confirm change");
        changeArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAreaActionPerformed(evt);
            }
        });

        changeAgent.setText("Confirm change");
        changeAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(responsibleAgentField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(alienIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(alienIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changeName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(changeEmail)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changePassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changePhone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(responsibleAgentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changeArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeAgent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        AdminHomePage adminHome = new AdminHomePage(idb);
        adminHome.setVisible(true);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        String newPass = passwordField.getText();
        String alienID = alienIDText.getText();
        String sqlQuestion = "UPDATE alien set Losenord = '" + newPass + "' WHERE Alien_ID = '" + alienID + "'";
        
        if(newPass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill the textbox with a password");
        }
        
        try{
            if(!newPass.isEmpty()){
                idb.update(sqlQuestion);
            }
        }catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void changeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameActionPerformed
        
        String alienIdt = alienIDText.getText();
        String newName = nameField.getText();
        
        String sqlQuestion = "UPDATE alien SET Namn = '" + newName + "' WHERE Alien_ID = '" + alienIdt + "'";
        if(alienIdt.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill the textbox with a name");
        }
        
        try{
        if(!alienIdt.isEmpty()){
            idb.update(sqlQuestion);
            JOptionPane.showMessageDialog(this, "Name has been updated");
        }
        } catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_changeNameActionPerformed

    private void changeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailActionPerformed
        String alienID = alienIDText.getText();
        String newEmail = emailField.getText();
        
        
        String sqlQuestion = "UPDATE alien SET Epost = '" + newEmail + "' WHERE Alien_ID = '" + alienID + "'";
        
        if(newEmail.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill the textbox with an email");
        }
        
        if(!newEmail.contains("@")){
            JOptionPane.showMessageDialog(this, "Don't forget the @ when entering a new email");
        }   
        try{
        if(!newEmail.isEmpty() && newEmail.contains("@")){
            idb.update(sqlQuestion);
            JOptionPane.showMessageDialog(this, "Email has been updated");
        }
            
        }catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_changeEmailActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void changePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneActionPerformed
        String newPhone = phoneNumberField.getText();
        String alienID = alienIDText.getText();
        
        String sqlQuestion = "UPDATE alien set Telefon = '" + newPhone + "' WHERE Alien_ID = '" + alienID + "'";
        
        if(newPhone.isEmpty()){
            JOptionPane.showMessageDialog(this, "You need to enter a new phone number");
        }
        
        
        try{
            if(!newPhone.isEmpty()){
                idb.update(sqlQuestion);
                JOptionPane.showMessageDialog(this, "Phonenumber has been updated");
            }
        }catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_changePhoneActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        String newPass = passwordField.getText();
        String alienID = alienIDText.getText();
        
        String sqlQuestion = "UPDATE alien SET Losenord = '" + newPass + "' WHERE Alien_ID = '" + newPass +"'";
        
        if(newPass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a new password");
        }
        try{
            if(!newPass.isEmpty()){
                idb.update(sqlQuestion);
                JOptionPane.showMessageDialog(this, "Password has been updated");
            }
            
        }catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_changePasswordActionPerformed

    private void changeAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAreaActionPerformed
        String newArea = areaField.getText();
        String alienID = alienIDText.getText();
        
        String sqlQuestion = "UPDATE alien SET plats = '" + newArea + "' WHERE Alien_ID = '" + alienID + "'";
        
        if(newArea.isEmpty()){
            JOptionPane.showMessageDialog(this, "You muster enter an area");
        }
        
        try{
            if(!newArea.isEmpty()){
                idb.update(sqlQuestion);
                JOptionPane.showMessageDialog(this, "Area has been updated");
            }
        }catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_changeAreaActionPerformed

    private void changeAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAgentActionPerformed
        String newAgent = responsibleAgentField.getText();
        String alienID = alienIDText.getText();
        
        String sqlQuestion = "UPDATE alien SET Ansvarig_Agent = '" + newAgent + "' WHERE Alien_ID = '" + alienID + "*";
        String sqlCheckAgent = "SELECT namn from agent where Agent_ID = '" + newAgent + "'";
        
        if(newAgent.isEmpty()){
            JOptionPane.showMessageDialog(this, "You must enter a value");
        }
        try{
        String sqlCheck = idb.fetchSingle(sqlCheckAgent);
        if(sqlCheck == null){
            JOptionPane.showMessageDialog(this, "There is no excisting agent with this ID");
        }
        
        if(!newAgent.isEmpty()){
            idb.update(sqlQuestion);
        }
        
        
        }catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_changeAgentActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeAlienInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAlienInfo(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alienIDText;
    private javax.swing.JTextField areaField;
    private javax.swing.JButton backButton;
    private javax.swing.JButton changeAgent;
    private javax.swing.JButton changeArea;
    private javax.swing.JButton changeEmail;
    private javax.swing.JButton changeName;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton changePhone;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField responsibleAgentField;
    // End of variables declaration//GEN-END:variables
}
