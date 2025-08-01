package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

import java.util.*;

public class Main {
    public static void main(String varargs[]) {
        System.out.println("Parking lot is working...");
        List<ParkingSpot> parkingSpotList = new ArrayList<>();

        for (int i = 0; i <= 2; i++) {
            parkingSpotList.add(new ParkingSpot(i, Set.of(VehicleType.TWO_WHEELER)));
        }

        for (int i = 3; i <= 4; i++) {
            parkingSpotList.add(new ParkingSpot(i, Set.of(VehicleType.FOUR_WHEELER)));
        }

        System.out.println("Starting....");
        Scanner scanner = new Scanner(System.in);
        int t = 5;
        while (t > 0) {
            t--;
            System.out.println("Enter vehicle number");
            Integer vehicleNumber = scanner.nextInt();

            System.out.println("Enter vehicle Id");
            Integer vehicleID = scanner.nextInt();

            System.out.println("Enter vehicle type: 1. 2 wheeler 2. 4 wheeler");
            Integer type = scanner.nextInt();

            VehicleType vehicleType;
            vehicleType = (type == 1) ? VehicleType.TWO_WHEELER : VehicleType.FOUR_WHEELER;

            Vehicle vehicle = new Vehicle(vehicleID, vehicleNumber, vehicleType);

            Entrance entrance = new Entrance(new ParkingSpotManagerFactory(parkingSpotList));
            System.out.println("trying to registering the vehicle");
            Ticket ticket = entrance.registerVehicle(vehicle);
            System.out.println("vehicle parked at " + ticket.getParkingSpot().getId());
            System.out.println();
        }

        for (int i = 0; i < parkingSpotList.size(); i++) {
            System.out.println("ID: " + parkingSpotList.get(i).getVehicle().getId() + ", Vehicle No: " + parkingSpotList.get(i).getVehicle().getVehicleNumber() + ", parkingspotid: " + i);
        }
    }
}
