/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

/**
 *
 * @author Katrina
 */
public enum Inventory {
    healthSnack1("Carrot Sticks","Plus to Happiness",0),
    healthSnack2("Apple Slices","Plus to Happiness", 0 ),
    healthSnack3("Water", "Plus to Happiness", 0),
    sugarSnack1("Candy Bar", "Plus Plus to Happiness, minus Money", 0),
    sugarSnack2 ("Chips","Plus Plus to Happiness, minus Money",0),
    sugarSnack3 ("Soda","Plus Plus to Happiness, minus Money",0),
    CarPart1("Spare Tire","Plus Car Health, minus Money", 0 ),
    CarPart2("Oil","Plus Car Health, minus Money", 0 ),
    CarPart3("Coolant","Plus Car Health, minus Money", 0 );

    private String inventoryType;
    private String description;
    private double quantityInStock;
    private gameDashBoard gameDashBoard;

    public gameDashBoard getGameDashBoard() {
        return gameDashBoard;
    }

    public void setGameDashBoard(gameDashBoard gameDashBoard) {
        this.gameDashBoard = gameDashBoard;
    }
    
    
    
    Inventory(String inventoryType, String description, double quantityInStock){
        this.inventoryType = inventoryType;
        this.description = description;
        this.quantityInStock= quantityInStock;
        
        
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public String getDescription() {
        return description;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", description=" + description + ", quantityInStock=" + quantityInStock + '}';
    }
    
}
