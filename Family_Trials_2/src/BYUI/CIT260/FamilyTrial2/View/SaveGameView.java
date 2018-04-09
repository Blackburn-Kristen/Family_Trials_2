/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;

import BYUI.CIT260.FamilyTrials2.exceptions.GameControlException;
import BYUI.CIT260.Family_Trials_2.model.Game;
import static buyi.cit260.FamilyTrials2.control.GameControl.saveGame;
import static family_trials_2.Family_Trials_2.getCurrentGame;

/**
 *
 * @author Katrina
 */
public class SaveGameView extends View{

    public SaveGameView() {
    }

    public SaveGameView(String message){
        this.displayMessage = message;
    }

  private String[] getInputs(){
      
      String[] input = new String[1];
      this.console.println("Type the path you want to save your game in.");
      input[0] = getInput();
      
      return input;
  }
    
    

    @Override
    public boolean doAction(String filePath) {
       Game game = getCurrentGame();
       
       try{
           saveGame(game, filePath);
       }
       catch (GameControlException ex){
           this.console.println("Error saving game" + ex.getMessage());
           return false;
       }
       
       this.console.println("File saves successfully in file: " + filePath );
       return true;
    }
    
    

    
}
