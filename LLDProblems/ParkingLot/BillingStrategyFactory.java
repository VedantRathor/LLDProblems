package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

public class BillingStrategyFactory {
//    public BillingStrategyFactory () { }
    public static BillingStrategy getBillingStrategy(Vehicle vehicle) {
        if (vehicle.getVehicleType() == VehicleType.TWO_WHEELER) return new NormalBillingStrategy();
        return new SpecialBillingStrategy();
    }
}
