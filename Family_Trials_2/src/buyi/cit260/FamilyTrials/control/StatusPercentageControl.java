/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials.control;

import BYUI.CIT260.Family_Trials_2.model.Inventory;
import BYUI.CIT260.Family_Trials_2.model.LocationEvents;
import BYUI.CIT260.Family_Trials_2.model.RandomEvents;
import BYUI.CIT260.Family_Trials_2.model.StatusPercent;
import BYUI.CIT260.Family_Trials_2.model.Vehicle;

/**
 *
 * @author Katrina
 */
public class StatusPercentageControl {
    private float happiness;
    
    public float calcHappiness(double inventory, double randomEvents, float locationEvents, float vehicle, double statusPercent){
    
        if (inventory < 0 || inventory > 30){
            return -1;
        }         
        
        if (randomEvents < 0 || randomEvents > 30){
            return -1;
        }
        
        if (locationEvents < 1.0 || locationEvents > 1.3){
            return -1;
        }
        
        if (vehicle < 1.0 || vehicle > 1.3){
            return -1;
        }
        
        if (statusPercent < 0 || statusPercent > 100){
            return -1;
        }
        
        
        
        happiness = (float) (statusPercent * vehicle * locationEvents + randomEvents + inventory);
        
        if (happiness < 0){
            happiness = 0;
        }
        
        if (happiness > 100){
            happiness = 100;
        }
        
        return happiness;
        
    }
    
}
