package com.cloudvendor.cloudvendor.DesignPatterns.DecoratorDP.DesignPizzaWithDecorator;

public class Main {
    public static void main(String varchar[]) {
        System.out.println("Design pizza with decorator running fine....");
        Pizza margheritha = new Margeritha();
        Pizza finalPizza = new Sauce(margheritha);

        System.out.println(finalPizza.getDescription());
    }
}
