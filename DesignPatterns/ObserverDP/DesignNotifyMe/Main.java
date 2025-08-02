package com.cloudvendor.cloudvendor.DesignPatterns.ObserverDP.DesignNotifyMe;

public class Main {
    public static void main(String varargs[]) {
        System.out.println("notify me working fine...");
        Observable iphoneObservable = new IphoneObservable();

        Observer iphoneObserver1 = new IphoneObserver(iphoneObservable, "Vedant");
        Observer iphoneObserver2 = new IphoneObserver(iphoneObservable, "Avishi");
        Observer iphoneObserver3 = new IphoneObserver(iphoneObservable, "Ram");
        Observer iphoneObserver4 = new IphoneObserver(iphoneObservable, "Dani");
        Observer iphoneObserver5 = new IphoneObserver(iphoneObservable, "Klad");

        iphoneObservable.addObserver(iphoneObserver1);
        iphoneObservable.addObserver(iphoneObserver2);
        iphoneObservable.addObserver(iphoneObserver3);
        iphoneObservable.addObserver(iphoneObserver4);
        iphoneObservable.addObserver(iphoneObserver5);

        iphoneObservable.addStock(10);
        iphoneObservable.removeStock(4);

    }
}
