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
public class StatusPercent implements Serializable{
    
    // class instances
    private double happiness;
    private double time;
    private double fuel;
    private double carHealth;
    private double money;
    private double speed;
    private double distanceTraveled;
    private double distanceRemaining;
    private ArrayList<Game> games = new ArrayList<Game>();

    public StatusPercent() {
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getCarHealth() {
        return carHealth;
    }

    public void setCarHealth(double carHealth) {
        this.carHealth = carHealth;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public double getDistanceRemaining() {
        return distanceRemaining;
    }

    public void setDistanceRemaining(double distanceRemaining) {
        this.distanceRemaining = distanceRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.happiness) ^ (Double.doubleToLongBits(this.happiness) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.fuel) ^ (Double.doubleToLongBits(this.fuel) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.carHealth) ^ (Double.doubleToLongBits(this.carHealth) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.distanceTraveled) ^ (Double.doubleToLongBits(this.distanceTraveled) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.distanceRemaining) ^ (Double.doubleToLongBits(this.distanceRemaining) >>> 32));
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
        final StatusPercent other = (StatusPercent) obj;
        if (Double.doubleToLongBits(this.happiness) != Double.doubleToLongBits(other.happiness)) {
            return false;
        }
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuel) != Double.doubleToLongBits(other.fuel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.carHealth) != Double.doubleToLongBits(other.carHealth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.distanceTraveled) != Double.doubleToLongBits(other.distanceTraveled)) {
            return false;
        }
        if (Double.doubleToLongBits(this.distanceRemaining) != Double.doubleToLongBits(other.distanceRemaining)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "StatusPercent{" + "happiness=" + happiness + ", time=" + time + ", fuel=" + fuel + ", carHealth=" + carHealth + ", money=" + money + ", speed=" + speed + ", distanceTraveled=" + distanceTraveled + ", distanceRemaining=" + distanceRemaining + '}';
    }
    
    
}
