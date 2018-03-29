/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;
import BYUI.CIT260.Family_Trials_2.model.Player;
import buyi.cit260.FamilyTrials2.control.GameControl;
import family_trials_2.Family_Trials_2;
import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author Katrina
 */
public class StartProgramView {

    public StartProgramView() { 
    }
        
       public void displayStartProgramView(){
            
        System.out.println("Welcome to family Trials: A Road Trip Adventure");
        
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
      
      System.out.println("Please enter your user ID");
        
      boolean valid = false;
      
      while( valid == false ){
          
          Scanner inFile;
          inFile = new Scanner(System.in);
          
          String playerName;
            playerName = inFile.nextLine();
          
          if(playerName.length() < 1 ){
              System.out.println("You must enter a menu value");
              continue;
          }
          
          inputs[0] = playerName.trim();
          
          valid = true;
          }
          return inputs;
    }
    
    private boolean doAction(String[] inputs){
           
        String[] playerName = inputs;
        Player player = GameControl.createNewPlayer(playerName);
          
        if( player == null ){
            System.out.println("could not create the player.");
            System.out.println("Enter a different name");
            return false;
        }
        
        Family_Trials_2.setPlayer(player);
        
        System.out.println("==================================================");
        System.out.println("Welcome to the game" + Arrays.toString(playerName));
        System.out.println("We hope you have a lot of fun!");
        System.out.println("==================================================");
        

        MainMenuView mainMenuView = new MainMenuView() {};
        mainMenuView.display();
        
        return true;
        }

}
