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
public class StatusBarView {
    
    public StatusBarView(){
        
    }

    void displayStatusBarView() {
        
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
      
      System.out.println("\nStatus Bar\n" + "\tC - Car health\n" + 
                         "\tH - Happiness\n" + "\tT - Time\n" + "\tE - Exit to Main Menu");
        
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
            case 'C':
                showCarHealth();
                break;
            case 'H':
                showHappiness();
                break;
            case 'T':
                showTime();
                break;
            case 'E':
                exit();
                return true;
            default:
                System.out.println("Invalid menu item.");
                return false;
        }
        return false;
          }

    private void showCarHealth() {
        System.out.println("showCarHealth() called");
    }

    private void showHappiness() {
        System.out.println("showHappiness() called");
    }

    private void showTime() {
        System.out.println("showTime() called");
    }

    private void exit() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }

}
