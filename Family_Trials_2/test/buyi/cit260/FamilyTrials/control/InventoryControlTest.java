/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Katrina
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcMoney method, of class InventoryControl.
     */
    @Test
    public void testCalcMoney() {
        
        System.out.println("calcMoney");
        
        // Test case 1 
        System.out.println("tTest case 1");
        
        // define the input variables
        double inventory = 25;
        double randomEvents = 10;
        double locationEvents = 100;
        double vehicle = 300;
        double statusPercent = 3000;
        InventoryControl instance = new InventoryControl();
        float expResult = 2565F;
        float result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
         // Test case 2 
        System.out.println("tTest case 2");
        
        // define the input variables
        inventory = 85;
        randomEvents = 10;
        locationEvents = 0;
        vehicle = 0;
        statusPercent = 75;
         expResult = 0;
         result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 3 
        System.out.println("tTest case 3");
        
        // define the input variables
         inventory = 0;
         randomEvents = 30;
         locationEvents = 0;
         vehicle = 0;
         statusPercent = 25;
         expResult = 0;
         result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 4 
        System.out.println("tTest case 4");
        
        // define the input variables
         inventory = 0;
         randomEvents = 0;
         locationEvents = 150;
         vehicle = 0;
         statusPercent = 149;
         expResult = 0;
         result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 5 
        System.out.println("tTest case 5");
        
        // define the input variables
         inventory = 0;
         randomEvents = 0;
         locationEvents = 0;
         vehicle = 10;
         statusPercent = 7;
         expResult = 0;
         result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 6 
        System.out.println("tTest case 6");
        
        // define the input variables
         inventory = 99;
        randomEvents = 0;
         locationEvents = 0;
         vehicle = 0;
         statusPercent = 100;
         expResult = 1;
        result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 7 
        System.out.println("tTest case 7");
        
        // define the input variables
         inventory = 99;
         randomEvents = 0;
         locationEvents = 0;
         vehicle = 0;
         statusPercent = 100;
         expResult = 1;
         result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
    }
    
}
