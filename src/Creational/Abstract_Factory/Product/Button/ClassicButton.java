package Creational.Abstract_Factory.Product.Button;

public class ClassicButton implements Button{
    @Override
    public void paint() {
        System.out.println("Рендеринг Classic Button");
    }
}
