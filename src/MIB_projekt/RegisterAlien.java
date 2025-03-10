/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MIB_projekt;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import oru.inf.InfException;


/**
 *
 * @author antti
 */
public class RegisterAlien extends javax.swing.JFrame {

    private static InfDB idb;
    Validation validator = new Validation();
   
    // Create a connection to the database

    /**
     * Creates new form LoginForm
     * @param iidb
     */
    public RegisterAlien(InfDB iidb) {
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

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alienIDText = new javax.swing.JTextField();
        areaText = new javax.swing.JTextField();
        registryDateText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        passwordText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameText = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        agentText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Register a new alien, enter info below:");

        jLabel2.setText("Alien ID:");

        jLabel3.setText("Registry date:");

        jLabel4.setText("Email:");

        jLabel5.setText("Password:");

        jLabel6.setText("Name:");

        jLabel7.setText("Area ID:");

        alienIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienIDTextActionPerformed(evt);
            }
        });

        areaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTextActionPerformed(evt);
            }
        });

        registryDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registryDateTextActionPerformed(evt);
            }
        });

        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
            }
        });

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        registerButton.setText("REGISTER");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(nameText);

        jLabel8.setText("Phone:");

        jLabel9.setText("Responsible agent:");

        jLabel10.setText("Choose race:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Worm", "Squid", "Boglodite" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel10)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(registryDateText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(emailText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(passwordText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(areaText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(phoneText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(agentText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alienIDText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(comboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(189, 189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alienIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registryDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(areaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alienIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienIDTextActionPerformed
                                          
    


    }//GEN-LAST:event_alienIDTextActionPerformed

    private void areaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTextActionPerformed

    private void registryDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registryDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registryDateTextActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
    String alienID = alienIDText.getText();
    String area = areaText.getText();
    String registryDate = registryDateText.getText();
    String email = emailText.getText();
    String password = passwordText.getText();
    String name = nameText.getText();
    String telefon = phoneText.getText();
    String agentID = agentText.getText();

    try {
    if(validator.isEmpty(alienID)||validator.isEmpty(area)||validator.isEmpty(registryDate)||
            validator.isEmpty(email)||validator.isEmpty(password)||validator.isEmpty(name)||
            validator.isEmpty(telefon)||validator.isEmpty(agentID)){
        JOptionPane.showMessageDialog(this, "Please fill in all the fields to register an alien");
    }
    else if(!validator.checkIfNull(idb.fetchSingle("SELECT Alien_ID from alien WHERE Alien_ID = " + alienID))){
        JOptionPane.showMessageDialog(this, "There is already an alien with this ID, please enter another ID");
    }
    else if(!validator.isNumeric(area)){
        JOptionPane.showMessageDialog(this, "You must enter an area ID and not the name of the area");
    }
    else if(password.length() > 6){
        JOptionPane.showMessageDialog(this, "Password cannot be longer than 6 chars");
    }
    else if(!email.endsWith("@mib.net")){
        JOptionPane.showMessageDialog(this, "Email must end with '@mib.net'");
    }
    else if(!validator.isValidDate(registryDate)){
        JOptionPane.showMessageDialog(this, "Registry date must be entered in format: xxxx-xx-xx");
    }
    else if(!validator.isNumeric(telefon)){
        JOptionPane.showMessageDialog(this, "Phone number must be numerical");
    }
    else if(validator.checkIfNull(idb.fetchSingle("SELECT Agent_ID from agent WHERE Agent_ID = '" + agentID + "'"))){
        JOptionPane.showMessageDialog(this, "There is no agent with the entered ID");
    }
    else if(validator.checkIfNull(idb.fetchSingle("SELECT Omrades_ID from omrade WHERE Omrades_ID = '" + area + "'"))){
        JOptionPane.showMessageDialog(this, "There is no area with this ID");
    }
    else{
        idb.insert("INSERT INTO alien (Alien_ID, Registreringsdatum, Epost, Losenord, Namn, Telefon, Plats, Ansvarig_Agent) VALUES ('" + alienID + "', '" + registryDate + "', '" + email + "', '" + password + "', '" + name + "', '" + telefon + "', '" + area + "', '" + agentID +"')");
        JOptionPane.showMessageDialog(this, "Alien with ID " + alienID + " added to the database.");
    }
    
    
    String selectedType = comboBox.getSelectedItem().toString();
    //om man trycker in worm i comboboxen kommer nästa fönster som berättar vad för ytterliggare information som ska registreras. i detta fall är det längden på alien
    if (selectedType.equalsIgnoreCase("Worm")) {

                JFrame frame = new JFrame("Extra information:");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JButton button = new JButton("Add extra information");
                button.addActionListener(e -> {
                    String input = JOptionPane.showInputDialog(frame, "Enter length in digits only:");
                    if(!validator.isNumeric(input)){
                        JOptionPane.showMessageDialog(this, "Please enter a numeric value");
                    }
                    else {
                        try {
// här följer alienID från tidigare fönster med längden på alien in i tabellen i sql.
                            
                            int langd = Integer.parseInt(input);
                            idb.insert("INSERT INTO worm (Alien_ID, Langd) Values('" + alienID + "'," + langd + ")");
                            JOptionPane.showMessageDialog(frame, "Updated successfully!");
                        } catch (InfException ex) {
                            Logger.getLogger(RegisterAlien.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });

                frame.getContentPane().add(button);
                frame.pack();
                frame.setVisible(true);
// en else sats utifall man registrerar squid, exakt samma fast squid anger man antal armar istället för längd
            } else {
        if (selectedType.equalsIgnoreCase("Squid")) {
            JFrame frame = new JFrame("Extra information");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JButton button = new JButton("Add extra information");
            button.addActionListener(e -> {
                String input = JOptionPane.showInputDialog("Enter antal armar:");
                if(!validator.isNumeric(input)){
                        JOptionPane.showMessageDialog(this, "Please enter a numeric value");
                    }
                else{
                    try {
                        
                        
                        int antalArmar = Integer.parseInt(input);
                        idb.insert("INSERT INTO squid (Alien_ID, Antal_Armar) Values ('" + alienID + "'," + antalArmar + ")");
                        JOptionPane.showMessageDialog(frame, "Updated succesfully!");
                    } catch (InfException ex) {
                        Logger.getLogger(RegisterAlien.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            });
            frame.getContentPane().add(button);
                frame.pack();
                frame.setVisible(true);
                // här anger man boglodites antal boogies. 3e alternativet av aliens ras man kan registrera.
        } else {
            if (selectedType.equalsIgnoreCase("Boglodite")) {
                JFrame frame = new JFrame("Extra information");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JButton button = new JButton("Add extra information");
                button.addActionListener(e-> {
                    String input = JOptionPane.showInputDialog("Enter antal boogies:");
                    if(!validator.isNumeric(input)){
                        JOptionPane.showMessageDialog(this, "Please enter a numeric value");
                    }
                    else{
                        try {
                            
                            int antalBoogies = Integer.parseInt(input);
                            idb.insert("INSERT INTO boglodite (Alien_ID, Antal_Boogies) Values ('" + alienID + "'," + antalBoogies + ")");
                            JOptionPane.showMessageDialog(frame, "Updated succesfullt!");
                        } catch (InfException ex) {
                        Logger.getLogger(RegisterAlien.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            });
            frame.getContentPane().add(button);
                frame.pack();
                frame.setVisible(true);
                        }
                    }
    }
 
} catch (InfException ex) {
    Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
}



    }//GEN-LAST:event_registerButtonActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agentText;
    private javax.swing.JTextField alienIDText;
    private javax.swing.JTextField areaText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane nameText;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField registryDateText;
    // End of variables declaration//GEN-END:variables
}
