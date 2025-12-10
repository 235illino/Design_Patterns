package Creational.Abstract_Factory;

import Creational.Abstract_Factory.Creator.ClassicGuiFactory;
import Creational.Abstract_Factory.Creator.GUIFactory;
import Creational.Abstract_Factory.Creator.ModernGuiFactory;

public class MainAbstractFactory {
    static void main() {
        System.out.println("1. modern Gui elements");
        applicationRunner(new ModernGuiFactory());
        System.out.println("2. classic Gui elements");
        applicationRunner(new ClassicGuiFactory());
    }

    static void applicationRunner(GUIFactory factory){
        factory.createButton().paint();
        factory.createCheckBox().paint();
    }
}
