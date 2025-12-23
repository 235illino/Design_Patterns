package Structural.Decorator.Concrete_Decorators;

import Structural.Decorator.Base_Decorator.BeverageDecorator;
import Structural.Decorator.Component.Beverage;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " з цукром";
    }
}
