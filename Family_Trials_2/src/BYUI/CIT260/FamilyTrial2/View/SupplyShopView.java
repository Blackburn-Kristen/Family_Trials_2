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
public class SupplyShopView {
    
    public SupplyShopView(){
       
    }

    void displaySupplyShopView() {
        
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
      
      System.out.println("Supply Shop\n" + "\tS - See Snack Options\n" + 
                         "\tC - See Car Part Options\n" + "\tM - Exit to Main Menu\n");
        
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
            case 'S':
                snackOptions();
                break;
            case 'C':
                carPartOptions();
                break;
            case 'M':
                exit();
                return true;
            default:
                System.out.println("Invalid menu item.");
                return false;
        }
        return false;
          }

    private void snackOptions() {
       SnackSupplyMenuView snackSupplyMenuView = new SnackSupplyMenuView();
        snackSupplyMenuView.displaySnackSupplyMenuView();
    }

    private void carPartOptions() {
       CarPartsMenuView carPartsMenuView = new CarPartsMenuView();
        carPartsMenuView.displayCarPartsMenuView();
    }

    private void exit() {
         MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }


}
