/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family_trials_2;

import BYUI.CIT260.Family_Trials_2.model.Player;
import BYUI.CIT260.Family_Trials_2.model.Vehicle;

/**
 *
 * @author krist
 */
public class Family_Trials_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player playerOne = new Player(); 
        
        playerOne.setName("Kristen");
        playerOne.setHighScore(200.00);
        
        String playerOneName = playerOne.getName();
        double playerOneHighScore = playerOne.getHighScore();
        
        System.out.println("Name = " + playerOneName + ", highScore = " 
                + playerOneHighScore);
        
        String VehicleType = Vehicle.SportCar.getVehicleType();
        String vehicleStats = Vehicle.SportCar.getVehicleStats();
    }
    
}
