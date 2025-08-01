package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

public class Entrance {
    private final ParkingSpotManagerFactory parkingSpotManagerFactory;

    public Entrance(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public Ticket registerVehicle(Vehicle vehicle) {
        ParkingSpotManager parkingSpotManager = this.parkingSpotManagerFactory.getParkingSpotManager(vehicle);
        ParkingSpot parkingSpot =  parkingSpotManager.parkVehicle(vehicle);

        return generateTicket(vehicle, parkingSpot);
    }

    private Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        return new Ticket(vehicle, parkingSpot);
    }
}
