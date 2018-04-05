/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;
import BYUI.CIT260.FamilyTrials2.exceptions.GameControlException;
import BYUI.CIT260.Family_Trials_2.model.Player;
import buyi.cit260.FamilyTrials2.control.GameControl;
import family_trials_2.Family_Trials_2;
import java.util.Arrays;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Katrina
 */
public class StartProgramView extends View{

    public StartProgramView() { 
    }
        
       public void displayStartProgramView(){
            
       this.console.println("Welcome to family Trials: A Road Trip Adventure");
        
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
      
      this.console.println("Please enter your user ID");
        
      boolean valid = false;
      
      while( valid == false ){
          
          Scanner inFile;
          inFile = new Scanner(System.in);
          
          String playerName;
            playerName = inFile.nextLine();
          
          if(playerName.length() < 1 ){
              ErrorView.display(this.getClass().getName(),"You must enter a menu value");
              continue;
          }
          
          inputs[0] = playerName.trim();
          
          valid = true;
          }
          return inputs;
    }
    
    private boolean doAction(String[] inputs){
           
        String[] playerName = inputs;
        Player player;
        try {
            player = GameControl.createNewPlayer(playerName);
        } catch (GameControlException ex) {
           ErrorView.display(this.getClass().getName(), "Error creating new player: " + ex.getMessage());
           return false;
        }
          
        
        
        Family_Trials_2.setPlayer(player);
        
        this.console.println("==================================================");
        this.console.println("Welcome to the game" + Arrays.toString(playerName));
        this.console.println("We hope you have a lot of fun!");
        this.console.println("==================================================");
        

        MainMenuView mainMenuView = new MainMenuView() {};
        mainMenuView.display();
        
        return true;
        }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
