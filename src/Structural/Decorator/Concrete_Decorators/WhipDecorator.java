package Structural.Decorator.Concrete_Decorators;

import Structural.Decorator.Base_Decorator.BeverageDecorator;
import Structural.Decorator.Component.Beverage;

public class WhipDecorator extends BeverageDecorator {
    public WhipDecorator(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() + 15.0;
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " з вершками";
    }
}
