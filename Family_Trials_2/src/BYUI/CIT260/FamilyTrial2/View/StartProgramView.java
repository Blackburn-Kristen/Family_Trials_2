/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

/**
 *
 * @author Katrina
 */
public class StartProgramView {

    public StartProgramView() {
    }

    /** displayStartProgramView() {
     endOfView = false
        DO
        inputs = getInputs()
       IF no inputs were entered OR the first input is Q
    RETURN
    ENDIF
       endOfView = doAction(inputs)
    WHILE endOfView != true
}
**/
    private void displayStartProgramView(){
        
        boolean endOfView = false;
        do{
           String[] inputs = getInputs();
           
           if(inputs[0] == null || inputs[0] == "Q"){
               return;
           }
               
           endOfView = doAction(inputs);
        }
           while(endOfView != true);
        
        }
    

/**getInputs(): String[] {

 inputs = new String array one element long
 Display a description of the view

valid = false
WHILE valid == false (no input value has been enterd)

Display the prompt message
Get the value entered from the keyboard
Trim off leading and trailing blanks from the value
IF length of the value < 1 then
Display "You must enter a non-blank value”
Continue (move to the top of the loop and repeat)
ENDIF
Assign the value to the fist position in the inputs array
valid = true (ends the loop)
ENDWHILE

RETURN inputs 
**/

    private String[] getInputs(){

        System.out.println("*** getInputs() called***");
        
        String[] inputs = new String[1];
        inputs[0] = "testInput";

        boolean valid = false;
        
        while(valid == false){
        System.out.println; 
        
        }

        return inputs;
        
    }
    
    private boolean doAction(String[] inputs) {
        System.out.println("**** doAcrtion() called ***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
        }
}

