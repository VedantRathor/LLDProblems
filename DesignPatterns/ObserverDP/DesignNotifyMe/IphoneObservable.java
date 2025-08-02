package com.cloudvendor.cloudvendor.DesignPatterns.ObserverDP.DesignNotifyMe;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
    private final List<Observer> observerList;
    private Integer stockQuantity;

    public IphoneObservable() {
        this.observerList = new ArrayList<>();
        this.stockQuantity = 0;
    }

    @Override
    public Integer getStockQuantity() {
        return this.stockQuantity;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void addStock(int quantity) {
        this.stockQuantity += quantity;
        this.notifyToAll();
    }

    @Override
    public void removeStock(int quantity) {
        this.stockQuantity -= quantity;
        this.notifyToAll();
    }

    @Override
    public void notifyToAll() {
        for (Observer observer: observerList) {
            observer.update();
        }
    }
}
