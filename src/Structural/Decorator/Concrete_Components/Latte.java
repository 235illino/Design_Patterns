package Structural.Decorator.Concrete_Components;

import Structural.Decorator.Component.Beverage;

public class Latte implements Beverage {
    private String description = "Latte";
    private double cost = 30.0;
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return cost;
    }
}
