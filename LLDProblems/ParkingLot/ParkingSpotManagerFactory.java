package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

import java.util.List;

public class ParkingSpotManagerFactory {

    private final List<ParkingSpot> masterList;

    public ParkingSpotManagerFactory(List<ParkingSpot> masterList) {
        this.masterList = masterList;
    }

    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        if (vehicle.getVehicleType() == VehicleType.TWO_WHEELER) {
            return new ParkingSpotManager(masterList, new NormalParkingStrategy());
        }
        return new ParkingSpotManager(masterList, new EndToExitParkingStrategy());
    }
}
