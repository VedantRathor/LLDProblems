package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

import java.util.List;

public class EndToExitParkingStrategy implements ParkingStrategy {
    @Override
    public Integer findParkingSpace(List<ParkingSpot> parkingSpotList) {
        for (int i = parkingSpotList.size()-1; i >= 0; i--) {
            if (parkingSpotList.get(i).isEmpty() && parkingSpotList.get(i).supportsVehicle(VehicleType.FOUR_WHEELER)) return i;
        }
        throw new RuntimeException("no parking spot for this four wheeler");
    }
}
