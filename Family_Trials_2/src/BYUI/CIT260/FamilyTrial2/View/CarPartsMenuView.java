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
public class CarPartsMenuView {
    
    public CarPartsMenuView(){
        
    }

    void displayCarPartsMenuView() {
       
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
      
      System.out.println("Car Parts Shop\n" + "\tO - Oil\n" + 
                         "\tC - Coolant\n" + "\tS - Spare Tires" + "\tQ - Return to Main Menu\n");
        
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
        
        switch(item.charAt(0)){
            case 'O':
                getOil();
                break;
            case 'C':
                getCoolant();
                break;
            case 'S':
                getSpareTire();
                break;
            case 'Q':
                quit();
                return true;
            default:
                System.out.println("Invalid menu item.");
                return false;
        }
        return false;
          }

    private void getOil() {
        System.out.println("getOil() called");
    }

    private void getCoolant() {
        System.out.println("getCoolant() called");
    }

    private void getSpareTire() {
        System.out.println("getSpareTire() called");
    }

    private void quit() {
        System.out.println("Exiting Car Part Shop");
    }
}
