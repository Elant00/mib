/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIB_projekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author antti
 */
public class ChangeAlienInfo extends javax.swing.JFrame {

    Validation validator = new Validation();
    
    
    
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
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        responsibleAgentField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        areaField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        alienIDText = new javax.swing.JTextField();
        changeName = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();
        changePhone = new javax.swing.JButton();
        changeArea = new javax.swing.JButton();
        changeAgent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newRaceText = new javax.swing.JTextField();
        changeName1 = new javax.swing.JButton();

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

        jLabel2.setText("Change race to:");

        changeName1.setText("Confirm change");
        changeName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeName1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(alienIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(newRaceText, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newRaceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeName1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkIfExists(String sql) {
        boolean exists = true;
        try {
            String existsS = idb.fetchSingle(sql);
            if(existsS == null) {
                return false;
            } 
            
        } catch (InfException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return exists;
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        AdminHomePage adminHome = new AdminHomePage(idb);
        adminHome.setVisible(true);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
       
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void changeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameActionPerformed
        String alienIdt = alienIDText.getText();
        String newName = nameField.getText();
        String sqlQuestion = "UPDATE alien SET Namn = '" + newName + "' WHERE Alien_ID = '" + alienIdt + "'"; // SQL-uppdateringsfråga för att ändra namnet på alien med specificerat Alien_ID
        String sqlCheck = "SELECT Alien_ID from alien WHERE Alien_ID = " + alienIdt; // SQL-fråga för att kontrollera om det finns en alien med det angivna Alien_ID
       
        if (validator.isEmpty(alienIdt)) { // Kontrollera om alienIdt är tomt
            JOptionPane.showMessageDialog(this, "You need to enter an Alien_ID"); // Visa ett meddelande om att användaren måste ange ett Alien_ID
        } else if (validator.isEmpty(newName)) { // Kontrollera om både newName och alienIdt är tomma
            JOptionPane.showMessageDialog(this, "Please fill the textbox with a name"); // Visa ett meddelande om att användaren måste fylla i ett namn
        } else if (!checkIfExists(sqlCheck)) { // Kontrollera om det inte finns någon alien med det angivna Alien_ID
            JOptionPane.showMessageDialog(this, "There is no alien with this ID"); // Visa ett meddelande om att det inte finns någon alien med det angivna Alien_ID
        } else if (validator.isNumeric(newName)) {
            JOptionPane.showMessageDialog(this, "You have to enter the name as a string!");
        } else {
            try {
                if (!alienIdt.isEmpty()) { // Kontrollera om alienIdt inte är tomt
                    idb.update(sqlQuestion); // Uppdatera namnet i databasen genom att köra SQL-uppdateringsfrågan
                    JOptionPane.showMessageDialog(this, "Name has been updated"); // Visa ett meddelande om att namnet har uppdaterats
                }
            } catch (InfException ex) {
                java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changeNameActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void changePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneActionPerformed
        String newPhone = phoneNumberField.getText();
        String alienID = alienIDText.getText();
        String sqlQuestion = "UPDATE alien set Telefon = '" + newPhone + "' WHERE Alien_ID = '" + alienID + "'";
        String sqlCheck = "SELECT Alien_ID from alien WHERE Alien_ID = " + alienID;
       
        if (validator.isEmpty(alienID)) {
            JOptionPane.showMessageDialog(this, "You need to enter an Alien_ID");
        } else if (validator.isEmpty(newPhone)) { // kollar om angivet telefonnummer är tomt
            JOptionPane.showMessageDialog(this, "You need to enter a new phone number");
        } else if (!checkIfExists(sqlCheck)) {
            JOptionPane.showMessageDialog(this, "There is no alien with this ID");
        } else if (!validator.isNumeric(newPhone)) {
            JOptionPane.showMessageDialog(this, "Please enter a numeric phone number");
        } else {
            try {
                if (!newPhone.isEmpty()) {
                    idb.update(sqlQuestion); // uppdaterar telefonnummer
                    JOptionPane.showMessageDialog(this, "Phonenumber has been updated");
                }
            } catch (InfException ex) {
                java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changePhoneActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        String newPass = passwordField.getText();
        String alienID = alienIDText.getText();
        String sqlQuestion = "UPDATE alien SET Losenord = '" + newPass + "' WHERE Alien_ID = '" + alienID + "'";
        String sqlCheck1 = "SELECT Alien_ID from alien WHERE Alien_ID = " + alienID;

        if (validator.isEmpty(alienID)) {
            JOptionPane.showMessageDialog(this, "You need to enter an Alien_ID");
        } else if (validator.isEmpty(newPass)) { // kollar om nytt lösenord är tomt
            JOptionPane.showMessageDialog(this, "Please enter a new password");

        } else if (!checkIfExists(sqlCheck1)) {
            JOptionPane.showMessageDialog(this, "There is no alien with this ID");
        } else {

            try {
                if (!newPass.isEmpty()) {
                    idb.update(sqlQuestion); //uppdaterar lösenord
                    JOptionPane.showMessageDialog(this, "Password has been updated");
                }

            } catch (InfException ex) {
                java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changePasswordActionPerformed

    private void changeAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAreaActionPerformed
        String newArea = areaField.getText();
        String alienID = alienIDText.getText();
        String sqlQuestion = "UPDATE alien SET plats = '" + newArea + "' WHERE Alien_ID = '" + alienID + "'";
        String sqlCheck1 = "SELECT Alien_ID from alien WHERE Alien_ID = " + alienID;
        String sqlCheck2 = "SELECT Omrades_ID from omrade WHERE Omrades_ID = " + newArea;

        if (validator.isEmpty(alienID)) {
            JOptionPane.showMessageDialog(this, "You need to enter an Alien_ID");
        } else if (validator.isEmpty(newArea)) {  // kollar om nytt omrade är tomt
            JOptionPane.showMessageDialog(this, "You muster enter an area");
        } else if (!checkIfExists(sqlCheck1)) {
            JOptionPane.showMessageDialog(this, "There is no alien with this ID");
        } else if (!checkIfExists(sqlCheck2)) {
            JOptionPane.showMessageDialog(this, "There is no area with this ID");
        } else if (!validator.isNumeric(newArea)) {
            JOptionPane.showMessageDialog(this, "You have to enter the area by ID!");
        } else {

            try {

                idb.update(sqlQuestion); // uppdaterar områda
                JOptionPane.showMessageDialog(this, "Area has been updated");

            } catch (InfException ex) {
                java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changeAreaActionPerformed

    private void changeAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAgentActionPerformed
        String newAgent = responsibleAgentField.getText();
        String alienID = alienIDText.getText();
        String sqlQuestion = "UPDATE alien SET Ansvarig_Agent = '" + newAgent + "' WHERE Alien_ID = '" + alienID + "'";
        String sqlCheckAgent = "SELECT Agent_ID from agent where Agent_ID = '" + newAgent + "'"; //sql kod för att kolla om agent finns med angivet agentID
        String sqlCheck1 = "SELECT Alien_ID from alien WHERE Alien_ID = " + alienID;

        if (validator.isEmpty(alienID)) {
            JOptionPane.showMessageDialog(this, "You need to enter an Alien_ID");
        } else if (validator.isEmpty(newAgent)) {
            JOptionPane.showMessageDialog(this, "You must enter a value");
        } else if (!checkIfExists(sqlCheck1)) {
            JOptionPane.showMessageDialog(this, "There is no alien with this ID");
        } else if (validator.isNumeric(newAgent)) {
            JOptionPane.showMessageDialog(this, "You have to enter the agent by ID!");
        } else {

            try {
                String sqlCheck = idb.fetchSingle(sqlCheckAgent);
                if (sqlCheck == null) {
                    JOptionPane.showMessageDialog(this, "There is no excisting agent with this ID");
                } else if (!newAgent.isEmpty()) {
                    idb.update(sqlQuestion); //uppdaterar ansvarade agent
                    JOptionPane.showMessageDialog(this, "Responsible agent has been updated");

                }

            } catch (InfException ex) {
                java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_changeAgentActionPerformed

    private void changeName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeName1ActionPerformed
        String newRace = newRaceText.getText().toLowerCase();
        String alienID = alienIDText.getText();
        boolean isBoglodite = false;
        boolean isWorm = false;
        boolean isSquid = false;
        String raceType = ""; // initiering för att kunna kolla vilken/vilka raser som finns
        String sqlCheckIfAlienExists = "SELECT Alien_ID from alien WHERE Alien_ID = " + alienID;

        JFrame frame = new JFrame("Extra information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Add extra information"); // skapa en ny frame och knapp för att lägga till extra information

        String sqlQuestionBoglo = "INSERT INTO boglodite (Alien_ID) VALUES (" + alienID + ")";
        String sqlRemoveBoglo = "DELETE FROM boglodite WHERE Alien_ID = " + alienID;

        String sqlQuestionWorm = "INSERT INTO worm (Alien_ID) VALUES (" + alienID + ")";
        String sqlRemoveWorm = "DELETE FROM worm WHERE Alien_ID = " + alienID;

        String sqlQuestionSquid = "INSERT INTO squid (Alien_ID) VALUES (" + alienID + ")";
        String sqlRemoveSquid = "DELETE FROM squid WHERE Alien_ID = " + alienID;

        String sqlCheckWhatRace = "SELECT COALESCE("
                + "(SELECT 'squid' FROM squid WHERE Alien_ID = " + alienID + "), "
                + "(SELECT 'worm' FROM worm WHERE Alien_ID = " + alienID + "), "
                + "(SELECT 'boglodite' FROM boglodite WHERE Alien_ID = " + alienID + ") "
                + ");";

        String sqlCheckIfRaceExists = "SELECT COUNT(*) "
                + "FROM information_schema.tables "
                + "WHERE table_schema = 'mibdb' AND table_name = '" + newRace + "'";

        try {
            String answerAlienID = idb.fetchSingle(sqlCheckIfAlienExists);
            ArrayList<HashMap<String, String>> result = idb.fetchRows(sqlCheckIfRaceExists);
            HashMap<String, String> row = result.get(0);
            String count = row.get("COUNT(*)");
            int tableCount = Integer.parseInt(count); // returnerar antalet tabeller som finns av rasen man anger, är det 0 så innebär det att rasen ej finns som tabell

            if (validator.isEmpty(alienID)) {
                JOptionPane.showMessageDialog(this, "You need to enter an Alien_ID");
            }
            else if (validator.isEmpty(newRace)) {
                JOptionPane.showMessageDialog(this, "You must enter a new race");
            }
            else if (validator.checkIfNull(answerAlienID)) {
                JOptionPane.showMessageDialog(this, "This alienID does not exist");
            } else if (tableCount == 0) {
                JOptionPane.showMessageDialog(this, "There is no race with this name");
            } else {

                ArrayList<HashMap<String, String>> list = idb.fetchRows(sqlCheckWhatRace); // går igenom alla typer av raser och returnerar rasnamn där alienIDt finns
                for (HashMap<String, String> alienRace : list) {
                    for (String key : alienRace.keySet()) {
                        raceType = alienRace.get(key);
                        
                        if(validator.checkIfNull(raceType)){
                            JOptionPane.showMessageDialog(this, "This AlienID is not connected to any race");
                        }

                        else if (raceType.equals("boglodite")) {
                            isBoglodite = true;
                        }
                        else if (raceType.equals("worm")) {
                            isWorm = true;
                        }
                        else if (raceType.equals("squid")) {
                            isSquid = true;
                        }

                    }

                }

                if (newRace.equals(raceType)) {
                    JOptionPane.showMessageDialog(this, "The alien is already of this race!");
                } else {

                    if (isBoglodite) {  // om alienID var en boglodite tar den bort denne ur boglodite tabellen
                        idb.delete(sqlRemoveBoglo);
                    }

                    if (isWorm) {   // om alienID var en worm tar den bort denne ur boglodite tabellen
                        idb.delete(sqlRemoveWorm);
                    }

                    if (isSquid) {  // om alienID var en squid tar den bort denne ur boglodite tabellen
                        idb.delete(sqlRemoveSquid);
                    } else if (newRace.equals("boglodite")) { //kommer in i denna else if om man lagt in "boglodite" som ras
                        idb.insert(sqlQuestionBoglo);
                        JOptionPane.showMessageDialog(this, "Alien with ID " + alienID + " has been update to race: " + newRace);
                        button.addActionListener(e -> {
                            String input = JOptionPane.showInputDialog(frame, "Enter amount of boogies:");

                            String sqlUpdateWorm = "UPDATE boglodite SET Antal_Boogies = '" + input + "' WHERE Alien_ID = '" + alienID + "'";

                            try {
                                idb.update(sqlUpdateWorm); //uppdaterar extra information för boglodite
                                JOptionPane.showMessageDialog(this, "Boglodite boogies updated successfully!");

                            } catch (InfException ex) {
                                System.out.println("An exception occurred: " + ex.getMessage());
                            }
                        });

                        frame.add(button);
                        frame.setSize(400, 300);
                        frame.setVisible(true);

                    } else if (newRace.equals("worm")) { //kommer in i denna else if om man lagt in "worm" som ras
                        idb.insert(sqlQuestionWorm);
                        JOptionPane.showMessageDialog(this, "Alien with ID " + alienID + " has been update to race: " + newRace);
                        button.addActionListener(e -> {
                            String input = JOptionPane.showInputDialog(frame, "Enter length:");

                            String sqlUpdateWorm = "UPDATE worm SET Langd = '" + input + "' WHERE Alien_ID = '" + alienID + "'";

                            try {
                                idb.update(sqlUpdateWorm); //uppdaterar extra information om worm
                                JOptionPane.showMessageDialog(this, "Worm length updated successfully!");

                            } catch (InfException ex) {
                                System.out.println("An exception occurred: " + ex.getMessage());
                            }
                        });

                        frame.add(button);
                        frame.setSize(400, 300);
                        frame.setVisible(true);

                    } else if (newRace.equals("squid")) { //kommer in i denna else if om man lagt in "squid" som ras
                        idb.insert(sqlQuestionSquid);
                        JOptionPane.showMessageDialog(this, "Alien with ID " + alienID + " has been update to race: " + newRace);
                        button.addActionListener(e -> {
                            String input = JOptionPane.showInputDialog(frame, "Enter amount of arms:");

                            String sqlUpdateWorm = "UPDATE squid SET Antal_Armar = '" + input + "' WHERE Alien_ID = '" + alienID + "'";

                            try {
                                idb.update(sqlUpdateWorm);
                                JOptionPane.showMessageDialog(this, "Squid arms updated successfully!");

                            } catch (InfException ex) {
                                System.out.println("An exception occurred: " + ex.getMessage());
                            }
                        });

                        frame.add(button);
                        frame.setSize(400, 300);
                        frame.setVisible(true);

                    }

                }

            }

        } catch (InfException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_changeName1ActionPerformed

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
    private javax.swing.JButton changeName;
    private javax.swing.JButton changeName1;
    private javax.swing.JButton changePassword;
    private javax.swing.JButton changePhone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField newRaceText;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField responsibleAgentField;
    // End of variables declaration//GEN-END:variables
}
