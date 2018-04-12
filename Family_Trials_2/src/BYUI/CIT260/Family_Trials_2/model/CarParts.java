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
public class CarParts implements Serializable{

   

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
    
    // class instance variables
    private double spareTire;
    private double oil;
    private double coolant;
    private ArrayList<Vehicle> vehicle = new ArrayList<>();

    public CarParts() {
    }
    
     public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }    

    public double getSpareTire() {
        return spareTire;
    }

    public void setSpareTire(double spareTire) {
        this.spareTire = spareTire;
    }

    public double getOil() {
        return oil;
    }

    public void setOil(double oil) {
        this.oil = oil;
    }

    public double getCoolant() {
        return coolant;
    }

    public void setCoolant(double coolant) {
        this.coolant = coolant;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.spareTire) ^ (Double.doubleToLongBits(this.spareTire) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.oil) ^ (Double.doubleToLongBits(this.oil) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.coolant) ^ (Double.doubleToLongBits(this.coolant) >>> 32));
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
        final CarParts other = (CarParts) obj;
        if (Double.doubleToLongBits(this.spareTire) != Double.doubleToLongBits(other.spareTire)) {
            return false;
        }
        if (Double.doubleToLongBits(this.oil) != Double.doubleToLongBits(other.oil)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coolant) != Double.doubleToLongBits(other.coolant)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CarParts{" + "spareTire=" + spareTire + ", oil=" + oil + ", coolant=" + coolant + '}';
    }
    
    
    
}
