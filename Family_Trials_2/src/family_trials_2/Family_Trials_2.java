/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family_trials_2;

import BYUI.CIT260.FamilyTrial2.View.StartProgramView;
import BYUI.CIT260.Family_Trials_2.model.Game;
import BYUI.CIT260.Family_Trials_2.model.Player;


/**
 *
 * @author krist
 */
public class Family_Trials_2 {
    
    private static Game currentGame = null;
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      StartProgramView startProgramView = new StartProgramView();
      startProgramView.displayStartProgramView();
      }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Family_Trials_2.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Family_Trials_2.player = player;
    }
    
    
}
    

