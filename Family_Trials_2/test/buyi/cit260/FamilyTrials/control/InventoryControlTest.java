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
        double inventory = 85;
        double randomEvents = 10;
        double locationEvents = 0;
        double vehicle = 0;
        double statusPercent = 75;
        InventoryControl instance = new InventoryControl();
        float expResult = -10;
        float result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 3 
        System.out.println("tTest case 3");
        
        // define the input variables
        double inventory = 0;
        double randomEvents = 30;
        double locationEvents = 0;
        double vehicle = 0;
        double statusPercent = 25;
        InventoryControl instance = new InventoryControl();
        float expResult = -5;
        float result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 4 
        System.out.println("tTest case 4");
        
        // define the input variables
        double inventory = 0;
        double randomEvents = 0;
        double locationEvents = 150;
        double vehicle = 0;
        double statusPercent = 149;
        InventoryControl instance = new InventoryControl();
        float expResult = -1;
        float result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 5 
        System.out.println("tTest case 5");
        
        // define the input variables
        double inventory = 0;
        double randomEvents = 0;
        double locationEvents = 0;
        double vehicle = 10;
        double statusPercent = 7;
        InventoryControl instance = new InventoryControl();
        float expResult = -3;
        float result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001);
        
        
        
        // Test case 6 
        System.out.println("tTest case 6");
        
        // define the input variables
        double inventory = 99;
        double randomEvents = 0;
        double locationEvents = 0;
        double vehicle = 0;
        double statusPercent = 100;
        InventoryControl instance = new InventoryControl();
        float expResult = 1;
        float result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001)
        
        
        
        // Test case 6 
        System.out.println("tTest case 6");
        
        // define the input variables
        double inventory = 99;
        double randomEvents = 25;
        double locationEvents = 145;
        double vehicle = 0;
        double statusPercent = 370;
        InventoryControl instance = new InventoryControl();
        float expResult = 1;
        float result = instance.calcMoney(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0001)
        
    }
    
}
