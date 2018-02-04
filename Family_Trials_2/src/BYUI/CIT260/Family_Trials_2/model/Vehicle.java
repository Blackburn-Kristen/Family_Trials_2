/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BYUI.CIT260.Family_Trials_2.model;

/**
 *
 * @author krist
 */
public enum Vehicle {
    
    SportCar("Mustang", "plus plus happiness, plus time, minus minus money"),
    FourDoor("Sudan", "negative happiness, nuetral time, plus money"),
    Van("Tank", "plus happiness, minus time, minus money");
    private String vehicleType;
    private String vehicleStats;
    private CarParts carParts;
    
    Vehicle(String vehicleType, String vehicleStats) {
        this.vehicleType = vehicleType;
        this.vehicleStats = vehicleStats;
    }

    public CarParts getCarParts() {
        return carParts;
    }

    public void setCarParts(CarParts carParts) {
        this.carParts = carParts;
    }
    
    

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleStats() {
        return vehicleStats;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleType=" + vehicleType + ", vehicleStats=" + vehicleStats + '}';
    }
    
    
}

