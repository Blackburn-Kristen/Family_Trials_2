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
public class Location implements Serializable {
    
    // class instances
    private double gmasHouse;
    private double touristTrap;
    private double pitStop;
    private double restaurant;
    private double gasStation;

    public Location() {
    }
    
    

    public double getGmasHouse() {
        return gmasHouse;
    }

    public void setGmasHouse(double gmasHouse) {
        this.gmasHouse = gmasHouse;
    }

    public double getTouristTrap() {
        return touristTrap;
    }

    public void setTouristTrap(double touristTrap) {
        this.touristTrap = touristTrap;
    }

    public double getPitStop() {
        return pitStop;
    }

    public void setPitStop(double pitStop) {
        this.pitStop = pitStop;
    }

    public double getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(double restaurant) {
        this.restaurant = restaurant;
    }

    public double getGasStation() {
        return gasStation;
    }

    public void setGasStation(double gasStation) {
        this.gasStation = gasStation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.gmasHouse) ^ (Double.doubleToLongBits(this.gmasHouse) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.touristTrap) ^ (Double.doubleToLongBits(this.touristTrap) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.pitStop) ^ (Double.doubleToLongBits(this.pitStop) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.restaurant) ^ (Double.doubleToLongBits(this.restaurant) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.gasStation) ^ (Double.doubleToLongBits(this.gasStation) >>> 32));
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.gmasHouse) != Double.doubleToLongBits(other.gmasHouse)) {
            return false;
        }
        if (Double.doubleToLongBits(this.touristTrap) != Double.doubleToLongBits(other.touristTrap)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pitStop) != Double.doubleToLongBits(other.pitStop)) {
            return false;
        }
        if (Double.doubleToLongBits(this.restaurant) != Double.doubleToLongBits(other.restaurant)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gasStation) != Double.doubleToLongBits(other.gasStation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "gmasHouse=" + gmasHouse + ", touristTrap=" + touristTrap + ", pitStop=" + pitStop + ", restaurant=" + restaurant + ", gasStation=" + gasStation + '}';
    }
    
    
    
}
