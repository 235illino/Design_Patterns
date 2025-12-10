package Creational.Abstract_Factory.Product.Checkbox;

public class ModernCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Рендеринг Modern Checkbox");
    }
}
