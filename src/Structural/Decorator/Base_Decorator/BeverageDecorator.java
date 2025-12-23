package Structural.Decorator.Base_Decorator;

import Structural.Decorator.Component.Beverage;

public abstract class BeverageDecorator implements Beverage {
    private Beverage beverage;
    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
