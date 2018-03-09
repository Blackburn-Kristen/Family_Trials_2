/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import java.util.Scanner;

/**
 *
 * @author krist
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View(){
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
         boolean done = false;
        do{
           String value = this.getInput();
           
           if(value.toUpperCase().equals("Q")){
               return;
           }
               
           done = this.doAction(value);
        }
           while(!done);   
    }
    
    @Override
    public String getInput(){
        
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
      
        while(!valid){
      System.out.println("\nEnter your selection below:");
      
      value = keyboard.nextLine();
      value = value.trim();
      
          if(value.length() < 1 ){
              System.out.println("You must enter a value");
              continue;
          }
          
          break;
    }
    
    return value;
}
    
}
