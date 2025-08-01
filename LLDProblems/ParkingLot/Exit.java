package com.cloudvendor.cloudvendor.LLDProblems.ParkingLot;

public class Exit {
    public Exit() { };

    public double generateBill(Ticket ticket) {
        BillingStrategy billingStrategy = BillingStrategyFactory.getBillingStrategy(ticket.getVehicle());
        return billingStrategy.generateBill(ticket);
    }
}
