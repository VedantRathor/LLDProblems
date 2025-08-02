package com.cloudvendor.cloudvendor.DesignPatterns.DecoratorDP.DesignPizzaWithDecorator;

public class Sauce extends PizzaDecorator {
    private final Pizza pizza;
    public Sauce(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " with sauce";
    }

    @Override
    public Integer getCost() {
        return this.pizza.getCost() + 10;
    }
}
