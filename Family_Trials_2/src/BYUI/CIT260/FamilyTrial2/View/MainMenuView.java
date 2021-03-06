/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import BYUI.CIT260.FamilyTrials2.exceptions.GameControlException;
import BYUI.CIT260.FamilyTrials2.exceptions.MapControlException;
import BYUI.CIT260.Family_Trials_2.model.Inventory;
import buyi.cit260.FamilyTrials2.control.GameControl;
import buyi.cit260.FamilyTrials2.control.MapControl;
import family_trials_2.Family_Trials_2;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        {
            try {
                startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
                ErrorView.display(this.getClass().getName(),"Invalid menu item.");
                return false;
        }
        return false;
    }

        
        private void startNewGame() throws MapControlException{
            
       
            
       
        try {
         GameControl.createNewGame(Family_Trials_2.getPlayer());
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(),"Error starting new game: " + ex.getMessage());
        }
          
       
    }

    void restartGame() {
        
        StartExistingGameView startExistingGameView = new StartExistingGameView();
         startExistingGameView.displayStartExistingGameView();
        
    }

    private void getHelp() {
      
        HelpMenuView helpMenuView = new HelpMenuView();
         helpMenuView.display(); 
        
        }
}
