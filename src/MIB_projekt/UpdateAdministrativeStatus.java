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
public class UpdateAdministrativeStatus extends javax.swing.JFrame {

   Validation validator = new Validation();
   private static InfDB idb;
    // Create a connection to the database

    /**
     * Creates new form LoginForm
     * @param iidb
     */
    public UpdateAdministrativeStatus(InfDB iidb) {
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

        jLabel1 = new javax.swing.JLabel();
        agentIDText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updateAgentField = new javax.swing.JTextField();
        removeStatus = new javax.swing.JButton();
        addStatuts = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter your Agent_ID: ");

        jLabel2.setText("Enter Agent_ID to give/remove administrative status below");

        removeStatus.setText("Remove");
        removeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStatusActionPerformed(evt);
            }
        });

        addStatuts.setText("Add");
        addStatuts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStatutsActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(updateAgentField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(removeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                        .addComponent(addStatuts, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(agentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(updateAgentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeStatus)
                    .addComponent(addStatuts)
                    .addComponent(backButton))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        UpdateAdministrativeStatus newAdmin = new UpdateAdministrativeStatus(idb);
        newAdmin.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addStatutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStatutsActionPerformed
        String currentAgentID = agentIDText.getText();
        String updateAgent = updateAgentField.getText();
        
        String sqlUpdate = "UPDATE agent SET Administrator = 'J' WHERE Agent_ID = " +updateAgent;
        String checkIfAlready = "SELECT Administrator from agent WHERE Agent_ID = " + updateAgent;
        String checkIfAdmin = "SELECT Administrator from agent WHERE Agent_ID = " + currentAgentID;
        String checkIfAdminExists = "SELECT Agent_ID FROM agent WHERE Agent_ID = " + currentAgentID;
        String checkIfExists = "SELECT Agent_ID FROM agent WHERE Agent_ID = " + updateAgent;
        
                
        if(validator.isEmpty(currentAgentID) || validator.isEmpty(updateAgent)){
            JOptionPane.showMessageDialog(this, "You must enter both your and the Agent_ID you want to change");
        }
        
        try{
            String adminStatus = idb.fetchSingle(checkIfAdmin);
            String alreadyAnswer = idb.fetchSingle(checkIfAlready);
            String agentExists = idb.fetchSingle(checkIfExists);
            String adminExists = idb.fetchSingle(checkIfAdminExists);
            
            if(validator.checkIfNull(agentExists)){
                JOptionPane.showMessageDialog(this, "The agentID you entered to change does not exist");
            }
            
            else if(validator.checkIfNull(adminExists)){
                JOptionPane.showMessageDialog(this, "Your adminID does not exist, please check that it is entered correctly");
            }
            
            else if(adminStatus.equals("N")){
                JOptionPane.showMessageDialog(this, "You are not an admin, you cannot make this change");
            }
            
            else if(adminStatus.equals("J") && currentAgentID.equals(updateAgent)){
                JOptionPane.showMessageDialog(this, "You cannot change your own status");
            }
            
            else if(alreadyAnswer.equals("J")){
                JOptionPane.showMessageDialog(this, "The agent you've entered is already an administrator");
            }
            
            else if(adminStatus.equals("J")){
                idb.update(sqlUpdate);
                JOptionPane.showMessageDialog(this, "Agent " + updateAgent + " now has administrative status!");
            }
            
            
            
        } catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_addStatutsActionPerformed

    private void removeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStatusActionPerformed
        String currentAgentID = agentIDText.getText();
        String updateAgent = updateAgentField.getText();
        
        String sqlUpdate = "UPDATE agent SET Administrator = 'N' WHERE Agent_ID = " +updateAgent;
        String checkIfAlready = "SELECT Administrator from agent WHERE Agent_ID = " + updateAgent;
        String checkIfAdmin = "SELECT Administrator from agent WHERE Agent_ID = " + currentAgentID;
        String checkIfExists = "SELECT Agent_ID from agent WHERE Agent_ID = " + updateAgent;
        String checkIfAdminExists = "SELECT Agent_ID from agent WHERE Agent_ID = " + currentAgentID;
        
        if(validator.isEmpty(currentAgentID) || validator.isEmpty(updateAgent)){
            JOptionPane.showMessageDialog(this, "You must enter both your and the Agent_ID you want to change");
        }
        try{
            String adminStatus = idb.fetchSingle(checkIfAdmin);
            String alreadyAnswer = idb.fetchSingle(checkIfAlready);
            String exists = idb.fetchSingle(checkIfExists);
            String adminExists = idb.fetchSingle(checkIfAdminExists);
            
            if(validator.checkIfNull(exists)){
                JOptionPane.showMessageDialog(this, "The agentID you want to update does not exist");
            }
            
            else if(validator.checkIfNull(adminExists)){
                JOptionPane.showMessageDialog(this, "Your adminID that you entered does not exist, please check that it is correctly entered");
            }
            
            else if(adminStatus.equals("N")){
                JOptionPane.showMessageDialog(this, "You are not an admin, you cannot make this change");
            }
            
            
            else if(adminStatus.equals("J") && currentAgentID.equals(updateAgent)){
                JOptionPane.showMessageDialog(this, "You cannot change your own status");
            }
            
            else if(alreadyAnswer.equals("N")){
                JOptionPane.showMessageDialog(this, "This agent's administrative status is already set to NO");
            }
            
            else if(adminStatus.equals("J")){
                idb.update(sqlUpdate);
                JOptionPane.showMessageDialog(this, "Agent " + updateAgent + " is no longer an administrator");
            }
            
            
            
        } catch (InfException ex) {
        java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_removeStatusActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAdministrativeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAdministrativeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAdministrativeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAdministrativeStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAdministrativeStatus(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStatuts;
    private javax.swing.JTextField agentIDText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton removeStatus;
    private javax.swing.JTextField updateAgentField;
    // End of variables declaration//GEN-END:variables
}
