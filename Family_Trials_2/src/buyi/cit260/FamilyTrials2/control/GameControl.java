/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.Family_Trials_2.model.Player;

/**
 *
 * @author Katrina
 */
public class GameControl {
    

    public static Player createNewPlayer(String[] playerName) {
        
        if(playerName == null || playerName[1].length() < 1 ){
            return null;
        } 
        
        Player player = new Player();
        
                return player;
    }
    
    public static void createNewGame(Player pleyer){
        System.out.println("creatNewPlayer() called");
        return;
    }
    
}
