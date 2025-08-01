package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

import java.util.Set;

public class ParkingSpot {
    private final Integer id;
    private boolean isEmpty;
    private Vehicle vehicle;
    private Set<VehicleType> hashSet;

    public ParkingSpot(Integer id, Set<VehicleType> hashSet) {
        this.id = id;
        this.isEmpty = true;
        this.vehicle = null;
        this.hashSet = hashSet;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isEmpty = true;
    }

    public Integer getId() {
        return id;
    }

    public boolean supportsVehicle(VehicleType vehicleType) {
        return hashSet.contains(vehicleType);
    }
}
