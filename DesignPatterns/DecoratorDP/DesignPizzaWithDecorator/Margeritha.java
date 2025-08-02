package com.cloudvendor.cloudvendor.DesignPatterns.DecoratorDP.DesignPizzaWithDecorator;

public class Margeritha implements Pizza {
    public Margeritha() { }
    @Override
    public String getDescription() {
        return "Margheritha Pizza";
    }

    @Override
    public Integer getCost() {
        return 100;
    }
}
