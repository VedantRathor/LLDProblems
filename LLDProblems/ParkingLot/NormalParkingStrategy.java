package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

import java.util.List;

public class NormalParkingStrategy implements ParkingStrategy {
    @Override
    public Integer findParkingSpace(List<ParkingSpot> parkingSpotList) {
        for (int i = 0; i < parkingSpotList.size(); i++) {
            if (parkingSpotList.get(i).supportsVehicle(VehicleType.TWO_WHEELER) && parkingSpotList.get(i).isEmpty()) {
                return i;
            }
        }
        throw new RuntimeException("no parking spot");
    }
}
