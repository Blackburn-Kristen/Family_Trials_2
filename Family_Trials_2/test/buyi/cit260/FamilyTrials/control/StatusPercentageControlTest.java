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

    /**
     * Test of calcCarHealth method, of class StatusPercentageControl.
     */
    @Test
    public void testCalcCarHealth() {
        System.out.println("calcCarHealth");
        
        // ---Test 1---
        System.out.println("\tTest case 1");
        
        // define input variables
        float spareTire = 1;
        float coolant = 1;
        float oil = 2;
        float randomEvents = 20;
        float locationStart = 2920;
        float locationCurrent = 2890;
        float locationEvents = 10;
        float carSpeed = 65;
        float statusPercentage = 70;
        StatusPercentageControl instance = new StatusPercentageControl();
        float expResult = 82;
        float result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 2---
        System.out.println("\tTest case 2");
        
        // define input variables
        spareTire = -2.0F;
        carSpeed = 65;
        locationEvents = 1;
        locationStart = 1;
        statusPercentage = 70.0F;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 3---
        System.out.println("\tTest case 3");
        
        // define input variables
        coolant = 3.0F;
        locationEvents = 1;
        locationStart = 1;
        carSpeed = 65;
        statusPercentage = 70.0F;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 4---
        System.out.println("\tTest case 4");
        
        // define input variables
        oil = 5.0F;
        locationEvents = 1;
        locationStart = 1;
        carSpeed = 65;
        statusPercentage = 70.0F;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 5---
        System.out.println("\tTest case 5");
        
        // define input variables
        randomEvents = 35.0F;
        carSpeed = 65;
        locationEvents = 1;
        locationStart = 1;
        statusPercentage = 70.0F;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 6---
        System.out.println("\tTest case 6");
        
        // define input variables
        locationEvents = -45.0F;
        locationStart = 1;
        statusPercentage = 70.0F;
        carSpeed = 65;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 7---
        System.out.println("\tTest case 7");
        
        // define input variables
        statusPercentage = -90.0F;
        locationEvents = 1;
        locationStart = 1;
        carSpeed = 65;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 8---
        System.out.println("\tTest case 8");
        
        // define input variables
        carSpeed = 55F;
        locationEvents = 1;
        locationStart = 1;
        statusPercentage = 70.0F;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 9---
        System.out.println("\tTest case 9");
        
        // define input variables
        locationStart = 5000.0F;
        locationEvents = 1;
        carSpeed = 65;
        statusPercentage = 70.0F;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 10---
        System.out.println("\tTest case 10");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 1;
        locationStart = 1;
        locationCurrent = 4500.0F;
        statusPercentage = 70.0F;
        expResult = -1;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 11---
        System.out.println("\tTest case 11");
        
        // define input variables
        spareTire = 0;
        carSpeed = 65;
        locationEvents = 10;
        locationCurrent = 1;
        locationStart = 1;
        statusPercentage = 50.0F;
        coolant = 0;
        oil = 0;
        randomEvents = 0;
        expResult = 45.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 12---
        System.out.println("\tTest case 12");
        
        // define input variables
        spareTire = 1;
        carSpeed = 65;
        locationEvents = 10;
        locationStart = 1;
        locationCurrent = 1;
        statusPercentage = 50.0F;
        expResult = 55.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 13---
        System.out.println("\tTest case 13");
        
        // define input variables
        carSpeed = 65;
        spareTire = 0;
        coolant = 0;
        locationCurrent = 1;
        locationEvents = 10;
        locationStart = 1;
        statusPercentage = 50.0F;
        expResult = 45.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 14---
        System.out.println("\tTest case 14");
        
        // define input variables
        carSpeed = 65;
        coolant = 2.0F;
        locationEvents = 10;
        locationStart = 1;
        locationCurrent = 1;
        statusPercentage = 50.0F;
        expResult = 65.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 15---
        System.out.println("\tTest case 15");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 10;
        locationStart = 1;
        coolant = 0;
        oil = 0.0F;
        locationCurrent = 1;
        statusPercentage = 50.0F;
        expResult = 45.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 16---
        System.out.println("\tTest case 16");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 10;
        locationStart = 1;
        locationCurrent = 1;
        oil = 2.0F;
        statusPercentage = 50.0F;
        expResult = 65.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 17---
        System.out.println("\tTest case 17");
        
        // define input variables
        carSpeed = 65;
        oil = 0;
        locationEvents = 10;
        locationStart = 1;
        randomEvents = 30.0F;
        statusPercentage = 50.0F;
        locationCurrent = 1;
        expResult = 15.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 18---
        System.out.println("\tTest case 18");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 10;
        locationStart = 1;
        locationCurrent = 1;
        randomEvents = 0.0F;
        statusPercentage = 50.0F;
        expResult = 45.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 19---
        System.out.println("\tTest case 19");
        
        // define input variables
        carSpeed = 65;
        locationStart = 1;
        locationEvents = 1.0F;
        locationCurrent = 1;
        statusPercentage = 50.0F;
        expResult = 49.5F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 20---
        System.out.println("\tTest case 20");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 100.0F;
        locationStart = 1;
        locationCurrent = 1;
        statusPercentage = 50.0F;
        expResult = 0.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 21---
        System.out.println("\tTest case 21");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 1;
        locationStart = 1;
        locationCurrent = 1;
        statusPercentage = 0.0F;
        expResult = 0.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 22---
        System.out.println("\tTest case 22");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 10;
        locationStart = 1;
        locationCurrent = 1;
        statusPercentage = 100.0F;
        expResult = 95.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 23---
        System.out.println("\tTest case 23");
        
        // define input variables
        carSpeed = 65F;
        locationEvents = 10;
        locationStart = 1;
        locationCurrent = 1;
        statusPercentage = 50.0F;
        expResult = 45.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 24---
        System.out.println("\tTest case 24");
        
        // define input variables
        carSpeed = 90F;
        locationEvents = 10;
        locationStart = 1;
        locationCurrent = 1;
        statusPercentage = 50.0F;
        expResult = 25.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 25---
        System.out.println("\tTest case 25");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 10;
        locationStart = 2920.0F;
        locationCurrent = 2920;
        statusPercentage = 50.0F;
        expResult = 45.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 26---
        System.out.println("\tTest case 26");
        
        // define input variables
        carSpeed = 65;
        locationStart = 1.0F;
        locationEvents = 10;
        locationCurrent = 1;
        statusPercentage = 50.0F;
        expResult = 45.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 27---
        System.out.println("\tTest case 27");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 10;
        locationStart = 2920;
        locationCurrent = 2920.0F;
        statusPercentage = 50.0F;
        expResult = 45.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
        
         // ---Test 28---
        System.out.println("\tTest case 28");
        
        // define input variables
        carSpeed = 65;
        locationEvents = 10;
        locationStart = 10;
        locationCurrent = 0.0F;
        statusPercentage = 50.0F;
        expResult = 44.0F;
        result = instance.calcCarHealth(spareTire, coolant, oil, randomEvents, locationStart, locationCurrent, locationEvents, carSpeed, statusPercentage);
        assertEquals(expResult, result, 0.0001);
    }
           
    }

        