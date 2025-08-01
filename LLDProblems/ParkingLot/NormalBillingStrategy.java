package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

public class NormalBillingStrategy implements BillingStrategy {
    @Override
    public double generateBill(Ticket ticket) {
        return 20;
    }
}
