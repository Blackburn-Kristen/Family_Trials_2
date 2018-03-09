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
           
           if(inputs[0] == null || "Q".equals(inputs[0]) || "q".equals(inputs[0])){
               continue;
           }
               
           endOfView = doAction(inputs);
        }
           while(endOfView != true);
        
    }
        
    private String[] getInputs(){
        
        String[] inputs = new String[1];
      
      System.out.println("Getting Help\n" + "\tG - What is the goal of the game? \n" + 
                         "\tM - How to move.\n" + "\tB - Show Status Bar \n"
              + "\tS - Supplies \n" + "\tX - Exit to main menu");
        
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
            case 'B':
                showStatusBar();
                break;
            case 'S':
                supplyShop();
                break;
            case 'X':
                exit();
                return true;
            default:
                System.out.println("Invalid menu item.");
                return false;
        }
        return false;
          }

    private void goalOfGame() {
        GoalOfGameView goalOfGameView = new GoalOfGameView();
        goalOfGameView.displayGoalOfGameView();
    }

    private void howToMove() {
        System.out.println("howToMove() Called");
    }

    private void showStatusBar() {
        StatusBarView statusBarView = new StatusBarView();
         statusBarView.displayStatusBarView();
    }

    private void supplyShop() {
        SupplyShopView supplyShopView = new SupplyShopView();
        supplyShopView.displaySupplyShopView();
    }

    private void exit() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

}
