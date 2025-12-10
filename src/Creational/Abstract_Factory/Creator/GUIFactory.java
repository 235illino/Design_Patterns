package Creational.Abstract_Factory.Creator;

import Creational.Abstract_Factory.Product.Button.Button;
import Creational.Abstract_Factory.Product.Checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
