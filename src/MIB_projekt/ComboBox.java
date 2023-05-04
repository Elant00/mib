/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIB_projekt;

import javax.swing.*;
/**
 *
 * @author antti
 */
public class ComboBox {
    private JComboBox<String> SelectComboBox;
    
    public ComboBox() {
        // create a new JComboBox object
        SelectComboBox = new JComboBox<>();
        
        SelectComboBox.addItem("Select your type");
        SelectComboBox.addItem("Agent");
        SelectComboBox.addItem("Alien");
        
    }
    
        public JComboBox<String> getSelectComboBox() {
        return SelectComboBox;
        }
}
