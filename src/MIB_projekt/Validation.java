/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIB_projekt;


/**
 *
 * @author antti
 */
public class Validation {
    
  


    
    public boolean isEmpty(String textFieldCheck){
    String textField = textFieldCheck;
    boolean isempty = false;
    
    if(textField.isEmpty()){
        isempty = true;
    }
    return isempty;
}
    
    public boolean checkIfNull(String textCheck){
        String textToCheck = textCheck;
        boolean isNull = false;
        
        if(textToCheck == null){
            isNull = true;
        }
        return isNull;
}
    
public boolean isNumeric(String stringIn){
    return stringIn.matches("\\d+");
}
    
    
public boolean isValidDate(String stringIn){
    String pattern = "\\d{4}-\\d{2}-\\d{2}";
    return stringIn.matches(pattern);
}






    
    
    
}


