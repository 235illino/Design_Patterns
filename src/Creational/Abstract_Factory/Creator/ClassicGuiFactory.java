package Creational.Abstract_Factory.Creator;

import Creational.Abstract_Factory.Product.Button.Button;
import Creational.Abstract_Factory.Product.Button.ClassicButton;
import Creational.Abstract_Factory.Product.Checkbox.Checkbox;
import Creational.Abstract_Factory.Product.Checkbox.ClassicCheckbox;

public class ClassicGuiFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new ClassicButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new ClassicCheckbox();
    }
}
