/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package family_trials_2;

import BYUI.CIT260.Family_Trials_2.model.RandomEvents;
import BYUI.CIT260.Family_Trials_2.model.Location;
import BYUI.CIT260.Family_Trials_2.model.Map;
import BYUI.CIT260.Family_Trials_2.model.Menu;
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
        
        String vehicleType = Vehicle.SportCar.getVehicleType();
        String vehicleStats = Vehicle.SportCar.getVehicleStats();
        
        System.out.println("Vehicle Type = " + vehicleType + ",Vehicle Stats = "
                           + vehicleStats);
        
        String eventType = RandomEvents.negativeEvent1.getEventType();
        String eventDescription = RandomEvents.negativeEvent1.getEventDescription();
        
        System.out.println("Event Type = " + eventType + 
                ",Event Description = " + eventDescription);
        
        Location locationOne = new Location();
        
        locationOne.setGmasHouse(5.0);
        
        System.out.println("Location = " + locationOne);
        
        Map mapDescription = new Map();
        mapDescription.setDescription("location");
        
        String mapDescriptionDescription = mapDescription.getDescription();
        
        System.out.println("Map Description = " + mapDescription);
        
    }
    
}
