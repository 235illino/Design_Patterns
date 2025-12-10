package Creational.Abstract_Factory.Product.Checkbox;

public class ClassicCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Рендеринг Classic Checkbox");
    }
}
