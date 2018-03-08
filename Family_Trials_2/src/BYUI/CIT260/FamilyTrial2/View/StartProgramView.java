/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.FamilyTrial2.View;
import BYUI.CIT260.Family_Trials_2.model.Player;
import buyi.cit260.FamilyTrials2.control.GameControl;
import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author Katrina
 */
public class StartProgramView extends View {

    public StartProgramView() { 
        super("Welcome to Family Trials: A Road Trip Adventure");
        
    }

    private boolean doAction(String[] inputs){
           
        String[] playerName = inputs;
        Player player = GameControl.createNewPlayer(playerName);
        
        if( player == null ){
            System.out.println("could not create the player.");
            System.out.println("Enter a different name");
            return false;
        }
        
        System.out.println("==================================================");
        System.out.println("Welcom to the game" + Arrays.toString(playerName));
        System.out.println("We hope you have a lot of fun!");
        System.out.println("==================================================");
        
        MainMenuView mainMenuView = new MainMenuView() {};
        mainMenuView.display();
        
        return true;
        }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
