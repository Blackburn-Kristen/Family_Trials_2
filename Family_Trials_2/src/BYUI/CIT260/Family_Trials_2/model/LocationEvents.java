/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author krist
 */
public class LocationEvents implements Serializable{
    
    // class instances
    private String sightSeeing;
    private String stopForGasStation;
    private String stopAtPitStop;
    private String stopForFood;
    private String reachGMasHouse;
    private ArrayList<Location> locations = new ArrayList<Location>();

    public LocationEvents() {
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
    
    
    
    public String getSightSeeing() {
        return sightSeeing;
    }

    public void setSightSeeing(String sightSeeing) {
        this.sightSeeing = sightSeeing;
    }

    public String getStopForGasStation() {
        return stopForGasStation;
    }

    public void setStopForGasStation(String stopForGasStation) {
        this.stopForGasStation = stopForGasStation;
    }

    public String getStopAtPitStop() {
        return stopAtPitStop;
    }

    public void setStopAtPitStop(String stopAtPitStop) {
        this.stopAtPitStop = stopAtPitStop;
    }

    public String getStopForFood() {
        return stopForFood;
    }

    public void setStopForFood(String stopForFood) {
        this.stopForFood = stopForFood;
    }

    public String getReachGMasHouse() {
        return reachGMasHouse;
    }

    public void setReachGMasHouse(String reachGMasHouse) {
        this.reachGMasHouse = reachGMasHouse;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.sightSeeing);
        hash = 11 * hash + Objects.hashCode(this.stopForGasStation);
        hash = 11 * hash + Objects.hashCode(this.stopAtPitStop);
        hash = 11 * hash + Objects.hashCode(this.stopForFood);
        hash = 11 * hash + Objects.hashCode(this.reachGMasHouse);
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
        final LocationEvents other = (LocationEvents) obj;
        if (!Objects.equals(this.sightSeeing, other.sightSeeing)) {
            return false;
        }
        if (!Objects.equals(this.stopForGasStation, other.stopForGasStation)) {
            return false;
        }
        if (!Objects.equals(this.stopAtPitStop, other.stopAtPitStop)) {
            return false;
        }
        if (!Objects.equals(this.stopForFood, other.stopForFood)) {
            return false;
        }
        if (!Objects.equals(this.reachGMasHouse, other.reachGMasHouse)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LocationEvents{" + "sightSeeing=" + sightSeeing + ", stopForGasStation=" + stopForGasStation + ", stopAtPitStop=" + stopAtPitStop + ", stopForFood=" + stopForFood + ", reachGMasHouse=" + reachGMasHouse + '}';
    }
    
    
    
}
