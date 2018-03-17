/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

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

    public static Player createNewPlayer(String[] playerName) {
        
        if(playerName == null || playerName[0].length() < 1 ){
            return null;
        } 
        
        Player player = new Player();
        
        player.setName(playerName[0]);
        
                return player;
    }
    
    public static int createNewGame(Player player){
          /**public static int createNewGame(Player player) {
if (player == null)
return -1
game = create a new Game object
Save a reference to the Player object in the game
Save a reference to the game in the main class
actors = createActors()
Save the list of actors in the Game object
Assign an actor to the player
items = createItems()
Save the list of items in the game
map = createMap(noOfRows, noOfColumns, items)
IF map == null THEN
 RETURN -1
ENDIF
Assign the map to the game
RETURN 1 // indicates success
}*/
        if (player == null){
            
            return -1;
            }
    
        Game game = new Game();
        game.getPlayer();
        game.setPlayer(player);
        
        MapControl mapControl = new MapControl();
        Map map = MapControl.createMap(5, 5);  
        
        if (map == null){
            
            return -1;
            
        }
        
    return 1;
        
}

    public static Inventory[] createItems(){
        
        System.out.println("creatItems() called");
        
        return null;
        
    }
    
}
