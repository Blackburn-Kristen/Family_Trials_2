/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import buyi.cit260.FamilyTrials2.control.GameControl;
import family_trials_2.Family_Trials_2;
import java.util.Scanner;

/**
 *
 * @author krist
 */
public class MainMenuView {

    public MainMenuView() {
    }
    
    public void displayMainMenuView(){
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
      
      System.out.println("Main Menu\n" + "\tN - Start new game\n" + 
                         "\tR - Restart exisiting game\n" + "\tH - Get help"
              + "on how to play the game\n" + "\tE - Exit");
        
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
            case 'N':
                startNewGame();
                break;
            case 'R':
                restartGame();
                break;
            case 'H':
                getHelp();
                break;
            case 'E':
                return true;
            default:
                System.out.println("Invalid menu item.");
                return false;
        }
        return false;
          }
        
        private void startNewGame(){
       
            GameControl.createNewGame(Family_Trials_2.getPlayer());
            
        GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.displayGameMenuView();
        }

    private void restartGame() {
        
        StartExistingGameView startExistingGameView = new StartExistingGameView();
        startExistingGameView.displayStartExistingGameView();
        
     
    }

    private void getHelp() {
      
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView(); 
        
        }
    }

