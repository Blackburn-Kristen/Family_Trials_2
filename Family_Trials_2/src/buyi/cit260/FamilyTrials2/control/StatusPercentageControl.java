/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

import BYUI.CIT260.FamilyTrials2.exceptions.StatusPercentControlException;
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
    private float carHealth;
    private float spareTireEffect;
    private float coolantEffect;
    private float oilEffect;
    private double locationEventEffect;
    private float carSpeedEffect;
    private float locationEffect;
    
    public float calcHappiness(double inventory, double randomEvents, float locationEvents, float vehicle, double statusPercent) throws StatusPercentControlException{
    
        if (inventory < -25 || inventory > 25){
            throw new StatusPercentControlException("Invalid inventory percentage");
        }         
        
        if (randomEvents < -30 || randomEvents > 30){
            throw new StatusPercentControlException("Invalid randomEvents percentage");
        }
        
        if (locationEvents < -1.3 || locationEvents > 1.3){
            throw new StatusPercentControlException("Invalid location event percentage");
        }
        
        if (vehicle < -1.3 || vehicle > 1.3){
            throw new StatusPercentControlException("Invalid vehicle percentage");
        }
        
        if (statusPercent < 0 || statusPercent > 100){
            throw new StatusPercentControlException("Invalid status percentage");
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
    
    public float calcCarHealth(float spareTire, float coolant, float oil, float randomEvents, float locationStart, float locationCurrent, 
            float locationEvents, float carSpeed, float statusPercentage) throws StatusPercentControlException {
        
        if (spareTire != 0 && spareTire != 1){
            throw new StatusPercentControlException("Invalid number of spare tires");
        }
        
        if (coolant < 0 || coolant > 2){
            throw new StatusPercentControlException("Invalid containers of coolant");
        }
        
        if (oil < 0 || oil > 2){
            throw new StatusPercentControlException("Invalid containers of oil");
        }
        
        if (randomEvents < 0 || randomEvents > 30){
            throw new StatusPercentControlException("Invalid random event");
        }
        
        if (locationEvents < 1 || locationEvents > 100){
            throw new StatusPercentControlException("invalid location event");
        }
        
        if (statusPercentage < 0 || statusPercentage > 100){
            throw new StatusPercentControlException("Invalid stsus percent");
        }
        
        if (carSpeed != 65 && carSpeed != 75 && carSpeed != 90){
            throw new StatusPercentControlException("Invalid car speed");
        }
        
        if (locationStart < 1 || locationStart > 2920){
            throw new StatusPercentControlException("Invalid location start");
        }
        
        if (locationCurrent < 0 || locationCurrent > 2920){
            throw new StatusPercentControlException("Invalid current location");
        }
        
        if (carSpeed == 65){
            carSpeedEffect = 0;
        }
        
        if (carSpeed == 75){
            carSpeedEffect = 10;
        }
        
        if (carSpeed == 90){
            carSpeedEffect = 20;
        }
        
        spareTireEffect = spareTire * 10;
        locationEventEffect = locationEvents * 0.5; 
        coolantEffect = coolant * 10;
        oilEffect = oil * 10;
        locationEffect = ((locationStart - locationCurrent) /10);
        carHealth = (float) (statusPercentage + spareTireEffect + coolantEffect + oilEffect - randomEvents - locationEventEffect -carSpeedEffect - locationEffect);
        
        if (carHealth > 100){
            carHealth = 100;
        }
        
        if (carHealth < 0){
            carHealth = 0;
        }
         return carHealth;
    }
}
