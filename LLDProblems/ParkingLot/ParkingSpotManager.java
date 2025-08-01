package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

import java.util.List;

public class ParkingSpotManager {
    private final List<ParkingSpot> parkingSpotList;
    private final ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        Integer parkingSpotId = parkingStrategy.findParkingSpace(parkingSpotList);
        parkingSpotList.get(parkingSpotId).parkVehicle(vehicle);
        return parkingSpotList.get(parkingSpotId);
    }

    public boolean removeVehicle(ParkingSpot parkingSpot) {
        parkingSpotList.get(parkingSpot.getId()).removeVehicle();
        return true;
    }
}
