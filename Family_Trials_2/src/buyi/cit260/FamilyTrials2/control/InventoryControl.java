/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials2.control;

/**
 *
 * @author Katrina
 */
public class InventoryControl {
    private float currentMoney;
    
    public float calcMoney(double inventory, double randomEvents, double locationEvents, double vehicle, double statusPercent){
    
         currentMoney = (float) (statusPercent - (vehicle + locationEvents + randomEvents + inventory));
        
         if ( currentMoney <= 0 ){
            return 0;
        }
         return currentMoney;
    }
}
