package com.cloudvendor.cloudvendor.DesignPatterns.DecoratorDP.DesignPizzaWithDecorator;

public class Cheese extends PizzaDecorator {
    private final Pizza pizza;
    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " with cheese";
    }

    @Override
    public Integer getCost() {
        return pizza.getCost() + 10;
    }
}
