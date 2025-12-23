package Structural.Decorator;

import Structural.Decorator.Concrete_Components.Espresso;
import Structural.Decorator.Concrete_Components.Latte;
import Structural.Decorator.Concrete_Decorators.MilkDecorator;
import Structural.Decorator.Concrete_Decorators.SugarDecorator;
import Structural.Decorator.Concrete_Decorators.WhipDecorator;

public class Client {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Latte latte = new Latte();
        MilkDecorator milkDecoratorEspresso = new MilkDecorator(espresso);
        SugarDecorator sugarDecoratorEspresso = new SugarDecorator(milkDecoratorEspresso);
        System.out.println("Кава: " + sugarDecoratorEspresso.getDescription() + " ціна: " + sugarDecoratorEspresso.cost());
        SugarDecorator sugarDecoratorLatte = new SugarDecorator(new SugarDecorator(latte));
        WhipDecorator whipDecoratorLatte = new WhipDecorator(sugarDecoratorLatte);
        System.out.println("Кава: " + whipDecoratorLatte.getDescription() + " ціна: " + whipDecoratorLatte.cost());
    }
}
