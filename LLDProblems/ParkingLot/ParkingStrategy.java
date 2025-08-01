package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

import java.util.List;

public interface ParkingStrategy {
    Integer findParkingSpace(List<ParkingSpot> parkingSpotList);
}
