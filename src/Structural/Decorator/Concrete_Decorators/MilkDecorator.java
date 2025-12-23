package Structural.Decorator.Concrete_Decorators;

import Structural.Decorator.Base_Decorator.BeverageDecorator;
import Structural.Decorator.Component.Beverage;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() + 10.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " з молоком";
    }
}
