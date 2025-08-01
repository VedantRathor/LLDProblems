package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

public class Vehicle {
    private final Integer id;
    private final Integer vehicleNumber;
    private final VehicleType vehicleType;

    public Vehicle(Integer id, Integer vehicleNumber, VehicleType vehicleType) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
