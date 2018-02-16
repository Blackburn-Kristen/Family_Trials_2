/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Katrina
 */
public class gameDashBoard implements Serializable {
    
    //Class instance variables 
    private double statusPercents;
    private String Inventory;
    private Game game; 
    private Inventory inventory;
    
    
    
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
    
    
    public gameDashBoard() {
    }

    
    
    public double getStatusPercents() {
        return statusPercents;
    }

    public void setStatusPercents(double statusPercents) {
        this.statusPercents = statusPercents;
    }

    public String getInventory() {
        return Inventory;
    }

    public void setInventory(String Inventory) {
        this.Inventory = Inventory;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.statusPercents) ^ (Double.doubleToLongBits(this.statusPercents) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.Inventory);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final gameDashBoard other = (gameDashBoard) obj;
        if (Double.doubleToLongBits(this.statusPercents) != Double.doubleToLongBits(other.statusPercents)) {
            return false;
        }
        if (!Objects.equals(this.Inventory, other.Inventory)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gameDashBoard{" + "statusPercents=" + statusPercents + ", Inventory=" + Inventory + '}';
    }
    
    
    
}
