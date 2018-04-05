/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.FamilyTrials2.exceptions.GameControlException;
import BYUI.CIT260.FamilyTrials2.exceptions.MapControlException;
import BYUI.CIT260.Family_Trials_2.model.Game;
import BYUI.CIT260.Family_Trials_2.model.Inventory;
import BYUI.CIT260.Family_Trials_2.model.Map;
import BYUI.CIT260.Family_Trials_2.model.Player;
import BYUI.CIT260.Family_Trials_2.model.Vehicle;
import family_trials_2.Family_Trials_2;
import java.util.ArrayList;

/**
 *
 * @author Katrina
 */
public class GameControl {
    
    public GameControl(){
    } 

    public static Player createNewPlayer(String[] playerName) throws GameControlException {
        
        if(playerName == null || playerName[0].length() < 1 ){
            throw new GameControlException("Invalid Character Name.");
        } 
        
        Player player = new Player();
        
        player.setName(playerName[0]);
        
                return player;
    }
    
    public static void createNewGame(Player player) throws GameControlException, MapControlException{
          
        if (player == null){
            
            throw new GameControlException("Invalid Character Name,");
            }
    
        Game game = new Game();
        game.setPlayer(player);
        
        MapControl mapControl = new MapControl();
        Map map = MapControl.createMap(3, 27);  
        
        if (map == null){
            
            throw new GameControlException("Map creation failed.");
            
        }
        
 
        
}

    public static Inventory[] createItems(){
        
        System.out.println("creatItems() called");
        
        return null;
        
    }
    
}
