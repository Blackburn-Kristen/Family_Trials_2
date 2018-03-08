/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import java.util.Scanner;

/**
 *
 * @author Katrina
 */
public abstract class View implements ViewInterface{
    
    protected String displayMessage;
    
    public View(){
    }
    
    public View(String Message) {
        String message = null;
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
         boolean endOfView = false;
        do{
           String[] inputs = getInputs();
           
           if(inputs[0] == null || "Q".equals(inputs[0]) || "q".equals(inputs[0])){
               continue;
           }
               
           endOfView = doAction(inputs);
        }
           while(endOfView != true);
        
    }
    
     private String[] getInputs(){
        
        String[] inputs = new String[1];
        
          System.out.println("Please Select a menu option");
          
      
      boolean valid = false;
      
      while( valid == false ){
          
          Scanner inFile;
          inFile = new Scanner(System.in);
          
          String option = inFile.nextLine();
          
          if(option.length() < 1 ){
              System.out.println("You must enter a menu value");
              continue;
          }
          
          inputs[0] = option.trim();
          
          valid = true;
          }
          return inputs;
    }
    
        private boolean doAction(String[] inputs){
           
        String[] menuItem = inputs;
        String item = menuItem[0].toUpperCase();
      
        return false;
          }
     
     @Override
     public boolean doAction (String value){
         
         value = value.toUpperCase(); //Convert to all upper case
         
         return false;
     }
}
