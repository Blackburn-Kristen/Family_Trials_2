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
class HelpMenuView {

    public HelpMenuView(){
        
    }
    
    void displayHelpMenuView() {
         
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
        
    private String[] getInputs(){
        
        String[] inputs = new String[1];
      
      System.out.println("Getting Help\n" + "\tG - What is the goal of the game? \n" + 
                         "\tM - How to move.\n" + "\tE - Estitmate Status Bar \n"
              + "\tS - Supplies \n" + "\tQ - Quit");
        
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
            case 'G':
                goalOfGame();
                break;
            case 'M':
                howToMove();
                break;
            case 'E':
                estimateStatus();
                break;
            case 'S':
                supplyShop();
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

    private void goalOfGame() {
        System.out.println("goalOfGame() Called");
    }

    private void howToMove() {
        System.out.println("howToMove() Called");
    }

    private void estimateStatus() {
        System.out.println("estimateStatus() Called");
    }

    private void supplyShop() {
        System.out.println("supplyShop() Called");
    }

    private void quit() {
        System.out.println("quit() Called");
    }
    
}
