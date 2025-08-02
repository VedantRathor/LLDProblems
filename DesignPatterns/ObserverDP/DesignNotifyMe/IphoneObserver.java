package com.cloudvendor.cloudvendor.DesignPatterns.ObserverDP.DesignNotifyMe;

public class IphoneObserver implements Observer {
    private final Observable IphoneObservable;
    private final String userName;
    public IphoneObserver(Observable IphoneObservable, String userName) {
        this.IphoneObservable = IphoneObservable;
        this.userName = userName;
    }
    @Override
    public void update() {
        Integer stocks = this.IphoneObservable.getStockQuantity();
        System.out.println("Notifying to " + this.userName + "...");
        System.out.println("Iphone stock: " + stocks);
    }
}
