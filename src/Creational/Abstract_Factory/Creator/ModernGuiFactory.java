package Creational.Abstract_Factory.Creator;

import Creational.Abstract_Factory.Product.Button.Button;
import Creational.Abstract_Factory.Product.Button.ModernButton;
import Creational.Abstract_Factory.Product.Checkbox.Checkbox;
import Creational.Abstract_Factory.Product.Checkbox.ModernCheckbox;

public class ModernGuiFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new ModernButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new ModernCheckbox();
    }
}
