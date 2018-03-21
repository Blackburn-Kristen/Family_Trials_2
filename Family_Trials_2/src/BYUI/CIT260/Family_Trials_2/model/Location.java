/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author krist
 */
public class Location implements Serializable {
    
    // class instances
    private int row;
    private int col;
    private boolean visited;
    private double gmasHouse;
    private double touristTrap;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    private double pitStop;
    private double restaurant;
    private double gasStation;
    private LocationEvents locationEvents;
    private ArrayList<Map> maps = new ArrayList<Map>();

    public Location() {
    }

    public LocationEvents getLocationEvents() {
        return locationEvents;
    }

    public void setLocationEvents(LocationEvents locationEvents) {
        this.locationEvents = locationEvents;
    }
    
    

    public ArrayList<Map> getMaps() {
        return maps;
    }

    public void setMaps(ArrayList<Map> maps) {
        this.maps = maps;
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
