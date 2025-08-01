package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

public class SpecialBillingStrategy implements BillingStrategy {
    @Override
    public double generateBill(Ticket ticket) {
        return 50;
    }
}
