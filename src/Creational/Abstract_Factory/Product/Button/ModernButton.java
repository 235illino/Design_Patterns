package Creational.Abstract_Factory.Product.Button;

public class ModernButton implements Button{
    @Override
    public void paint() {
        System.out.println("Рендеринг Modern Button");
    }
}
