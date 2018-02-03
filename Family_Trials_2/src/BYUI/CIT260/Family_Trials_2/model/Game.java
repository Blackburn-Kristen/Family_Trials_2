/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

import java.io.Serializable;
/**
 *
 * @author krist
 */
public class Game implements Serializable {
    
    // class instance variables
    private double palyerLocation;
    private Player player;

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    

    public double getPalyerLocation() {
        return palyerLocation;
    }

    public void setPalyerLocation(double palyerLocation) {
        this.palyerLocation = palyerLocation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.palyerLocation) ^ (Double.doubleToLongBits(this.palyerLocation) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.palyerLocation) != Double.doubleToLongBits(other.palyerLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "palyerLocation=" + palyerLocation + '}';
    }
    
    
    
}
