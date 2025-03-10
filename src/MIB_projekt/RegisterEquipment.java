/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIB_projekt;

import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author emilrydberg
 */
public class RegisterEquipment extends javax.swing.JFrame {

    Validation validator = new Validation();

    private static InfDB idb;
    // Create a connection to the database

    /**
     * Creates new form LoginForm
     *
     * @param iidb
     */
    public RegisterEquipment(InfDB iidb) {
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
        jLabel2 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox<>();
        RegisterButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        AgentIDText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EquipmentIdText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EquipmentNameText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dateText = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Equipment information");

        jLabel2.setText("Type:");

        comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapen", "Kommunikation", "Teknik" }));
        comboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTypeActionPerformed(evt);
            }
        });

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Your AgentID:");

        AgentIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentIDTextActionPerformed(evt);
            }
        });

        jLabel4.setText("New equipment ID:");

        EquipmentIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentIdTextActionPerformed(evt);
            }
        });

        jLabel6.setText("Equipment name:");

        EquipmentNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentNameTextActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(dateText);

        jLabel5.setText("Date of the day:");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(AgentIDText)
                    .addComponent(EquipmentIdText)
                    .addComponent(EquipmentNameText)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterButton)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AgentIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EquipmentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(EquipmentNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed

    }//GEN-LAST:event_comboTypeActionPerformed

    private void AgentIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgentIDTextActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        String agentId = AgentIDText.getText();
        String selectedType = comboType.getSelectedItem().toString();
        String equipmentId = EquipmentIdText.getText();
        String equipmentName = EquipmentNameText.getText();
        String newDate = dateText.getText();
        String sqlCheck = "SELECT Agent_ID from agent where Agent_ID = " + agentId;
        String sqlCheck1 = "SELECT Utrustnings_ID from Utrustning where Utrustnings_ID = " + equipmentId;
        try {

            if (validator.isEmpty(agentId)) { //kolla så att information skrivs in 
                JOptionPane.showMessageDialog(this, "You must enter an Agent_ID to register equipment");
            } else if (validator.isEmpty(equipmentId)) {
                JOptionPane.showMessageDialog(this, "You must enter an equipmentID to register equipment");
            } else if (validator.isEmpty(equipmentName)) {
                JOptionPane.showMessageDialog(this, "You must enter an equipment name to register equipment");
            } else if (!validator.isValidDate(newDate)) {
                JOptionPane.showMessageDialog(this, "Date must be entered in format xxxx-xx-xx");
            } else if (!validator.isNumeric(equipmentId)) {
                JOptionPane.showMessageDialog(this, "You must enter a numerical value as an equipmentID");
            } else if (!validator.isNumeric(agentId)) {
                JOptionPane.showMessageDialog(this, "Please enter agentID and not a string");
            } else if (validator.checkIfNull(idb.fetchSingle(sqlCheck))) {
                JOptionPane.showMessageDialog(this, "There is no Agent with this ID");
            } else if (!validator.checkIfNull(idb.fetchSingle(sqlCheck1))) {
                JOptionPane.showMessageDialog(this, "This equipment_ID already exists!");
                
                
            } else if (selectedType.equalsIgnoreCase("Vapen")) {

                JFrame frame = new JFrame("Extra information:");
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

                JButton button = new JButton("Add extra information");
                button.addActionListener(e -> {
                    String input = JOptionPane.showInputDialog(frame, "Enter kaliber quantity:");
                    if (validator.isEmpty(input)) {
                        JOptionPane.showMessageDialog(this, "Please enter a value");
                    } else if (!validator.isNumeric(input)) {
                        JOptionPane.showMessageDialog(this, "You must enter a numeric value on 'Kaliber'");
                    } else {
                        try {
                            idb.insert("INSERT INTO Utrustning (Utrustnings_ID, Benamning) Values('" + equipmentId + "', '" + equipmentName + "')");
                            idb.insert("INSERT INTO Innehar_Utrustning (Agent_ID, Utrustnings_ID, Utkvitteringsdatum) Values('" + agentId + "', '" + equipmentId + "', '" + newDate + "')");
                            String tableName = "vapen";
                            int quantity = Integer.parseInt(input);
                            idb.insert("INSERT INTO " + tableName + "  (vapen.Utrustnings_ID, Kaliber) Values('" + equipmentId + "'," + quantity + ")");
                            JOptionPane.showMessageDialog(frame, "Updated successfully!");
                        } catch (InfException ex) {
                            Logger.getLogger(RegisterEquipment.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                frame.getContentPane().add(button);
                frame.pack();
                frame.setVisible(true);

            } else if (selectedType.equalsIgnoreCase("Teknik")) {
                idb.insert("INSERT INTO Utrustning (Utrustnings_ID, Benamning) Values('" + equipmentId + "', '" + equipmentName + "')");
                idb.insert("INSERT INTO Innehar_Utrustning (Agent_ID, Utrustnings_ID, Utkvitteringsdatum) Values('" + agentId + "', '" + equipmentId + "', '" + newDate + "')");
                JFrame frame = new JFrame("Extra information:");
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

                JButton button = new JButton("Add extra information");
                button.addActionListener(e -> {
                    String input = JOptionPane.showInputDialog(frame, "Enter kraftkalla:");
                    if (validator.isEmpty(input)) {
                        JOptionPane.showMessageDialog(this, "Please enter a value");
                    } else if (validator.isNumeric(input)) {
                        JOptionPane.showMessageDialog(this, "'Kraftkälla' must be entered as a string");
                    } else {
                        try {
                            idb.insert("INSERT INTO Utrustning (Utrustnings_ID, Benamning) Values('" + equipmentId + "', '" + equipmentName + "')");
                            idb.insert("INSERT INTO Innehar_Utrustning (Agent_ID, Utrustnings_ID, Utkvitteringsdatum) Values('" + agentId + "', '" + equipmentId + "', '" + newDate + "')");
                            String tableName = "teknik";
                            String kraftkalla = input;
                            idb.insert("INSERT INTO " + tableName + " (teknik.Utrustnings_ID, Kraftkalla) Values('" + equipmentId + "', '" + kraftkalla + "')");
                            JOptionPane.showMessageDialog(frame, "Updated successfully!");
                        } catch (InfException ex) {
                            Logger.getLogger(RegisterEquipment.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                frame.getContentPane().add(button);
                frame.pack();
                frame.setVisible(true);

            } else if (selectedType.equalsIgnoreCase("Kommunikation")) {
                idb.insert("INSERT INTO Utrustning (Utrustnings_ID, Benamning) Values('" + equipmentId + "', '" + equipmentName + "')");
                idb.insert("INSERT INTO Innehar_Utrustning (Agent_ID, Utrustnings_ID, Utkvitteringsdatum) Values('" + agentId + "', '" + equipmentId + "', '" + newDate + "')");
                JFrame frame = new JFrame("Extra information:");
                frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

                JButton button = new JButton("Add extra information");
                button.addActionListener(e -> {
                    String input = JOptionPane.showInputDialog(frame, "Enter Overforingsteknik:");
                    if (validator.isEmpty(input)) {
                        JOptionPane.showMessageDialog(this, "Please enter a value");
                    } else if (validator.isNumeric(input)) {
                        JOptionPane.showMessageDialog(this, "'Överföringsteknik' must be entered as a string");
                    } else {
                        try {
                            idb.insert("INSERT INTO Utrustning (Utrustnings_ID, Benamning) Values('" + equipmentId + "', '" + equipmentName + "')");
                            idb.insert("INSERT INTO Innehar_Utrustning (Agent_ID, Utrustnings_ID, Utkvitteringsdatum) Values('" + agentId + "', '" + equipmentId + "', '" + newDate + "')");
                            String tableName = "Kommunikation";
                            String overforingsTeknik = input;
                            idb.insert("INSERT INTO " + tableName + "  (Kommunikation.Utrustnings_ID, Overforingsteknik) Values('" + equipmentId + "', '" + overforingsTeknik + "')");
                            JOptionPane.showMessageDialog(frame, "Updated successfully!");
                        } catch (InfException ex) {
                            Logger.getLogger(RegisterEquipment.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                frame.getContentPane().add(button);
                frame.pack();
                frame.setVisible(true);

            }

        } catch (InfException ex) {
            Logger.getLogger(RegisterEquipment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void EquipmentIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipmentIdTextActionPerformed

    private void EquipmentNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EquipmentNameTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        AgentActionPage actionPage = new AgentActionPage(idb);
        actionPage.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterEquipment(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgentIDText;
    private javax.swing.JTextField EquipmentIdText;
    private javax.swing.JTextField EquipmentNameText;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JTextPane dateText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
