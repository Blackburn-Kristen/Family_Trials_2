/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit260.FamilyTrials.control;

import static java.sql.JDBCType.NULL;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krist
 */
public class StatusPercentageControlTest {
    
    public StatusPercentageControlTest() {
    }

    /**
     * Test of calcHappiness method, of class StatusPercentageControl.
     */
    @Test
    public void testCalcHappiness() {
        System.out.println("calcHappiness");
        
        // Test case 1 
        System.out.println("tTest case 1");
        
        // define the input variables
        double inventory = 15.0;
        double randomEvents = -10.0;
        float locationEvents = 1.1F;
        float vehicle = 1.05F;
        double statusPercent = 75;
        StatusPercentageControl instance = new StatusPercentageControl();
        float expResult = 91.625F;
        float result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
    
        // Test case 2 
        System.out.println("tTest case 2");
        
        // define the input variables
        inventory = 30.0;
        randomEvents = 0.0;
        locationEvents = 0.0F;
        vehicle = 0.0F;
        statusPercent = 65;
        expResult = -1;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
    
        // Test case 3 
        System.out.println("tTest case 3");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 35.0;
        locationEvents = 0.0F;
        vehicle = 0.0F;
        statusPercent = 65;
        expResult = -1;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
   
        // Test case 4 
        System.out.println("tTest case 4");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = -1.35F;
        vehicle = 0.0F;
        statusPercent = 75;
        expResult = -1;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
   
        // Test case 5 
        System.out.println("tTest case 5");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 0.0F;
        vehicle = 1.35F;
        statusPercent = 70;
        expResult = -1;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
        
        // Test case 6 
        System.out.println("tTest case 6");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 0.0F;
        vehicle = 0.0F;
        statusPercent = -30;
        expResult = -1;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
    
        // Test case 7 
        System.out.println("tTest case 7");
        
        // define the input variables
        inventory = -25.0;
        randomEvents = 0.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 75;
        expResult = 50;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
   
        // Test case 8 
        System.out.println("tTest case 8");
        
        // define the input variables
        inventory = 25.0;
        statusPercent = 75;
        expResult = 100;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
    
        // Test case 9 
        System.out.println("tTest case 9");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 75;
        expResult = 75;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
   
        // Test case 10 
        System.out.println("tTest case 10");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = -30.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 75;
        expResult = 45;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
    
        // Test case 11 
        System.out.println("tTest case 11");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 75;
        expResult = 75;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
   
        // Test case 12 
        System.out.println("tTest case 12");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 75;
        expResult = (float) 75;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
   
        // Test case 13 
        System.out.println("tTest case 13");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 75;
        expResult = (float) 75;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
   
        // Test case 14 
        System.out.println("tTest case 14");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 75;
        expResult = (float) 75;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
   
        // Test case 15 
        System.out.println("tTest case 15");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 1.0;
        expResult = (float) 1.0;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
        
  
        // Test case 16 
        System.out.println("tTest case 16");
        
        // define the input variables
        inventory = 0.0;
        randomEvents = 0.0;
        locationEvents = 1.0F;
        vehicle = 1.0F;
        statusPercent = 100.0;
        expResult = (float) 100.0;
        result = instance.calcHappiness(inventory, randomEvents, locationEvents, vehicle, statusPercent);
        assertEquals(expResult, result, 0.0001);
           }
           
    }

