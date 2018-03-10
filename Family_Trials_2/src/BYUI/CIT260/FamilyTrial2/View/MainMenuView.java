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
public class MainMenuView extends View {

    public MainMenuView() {
        super("Main Menu\n" + "\tN - Start new game\n" + 
                         "\tR - Restart exisiting game\n" + "\tH - Get help"
              + " on how to play the game\n" + "\tE - Exit\n" + "Please select a menu option");

    }
        @Override 
        public boolean doAction(String value){
           
        value = value.toUpperCase();
        
        switch(value.charAt(0)){
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
         helpMenuView.display(); 
        
        }
}
