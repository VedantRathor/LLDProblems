package com.cloudvendor.cloudvendor.DesignPatterns.ObserverDP.DesignNotifyMe;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void addStock(int quantity);
    void removeStock(int quantity);
    void notifyToAll();

    Integer getStockQuantity();
}
