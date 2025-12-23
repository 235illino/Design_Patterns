package Structural.Decorator.Concrete_Components;

import Structural.Decorator.Component.Beverage;

public class Espresso implements Beverage {
    private String description = "Espresso";
    private double cost = 20.0;
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return cost;
    }
}
