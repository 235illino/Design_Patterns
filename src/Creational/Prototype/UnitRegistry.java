package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class UnitRegistry {
    private final Map<String, Unit> registerPrototypes = new HashMap<>();

    public void addUnit(String key, Unit unit){

        registerPrototypes.put(key, unit.clone());
    }

    public Unit getClone(String key){
        return registerPrototypes.getOrDefault(key, null);
    }

    static void main() {
        Starship starship = new Starship(1, 5, new Equipment("Himars"));
        UnitRegistry unitRegistry = new UnitRegistry();
        unitRegistry.addUnit("starship", starship);
        var clone1 = (Starship)unitRegistry.getClone("starship");
        var clone2 = (Starship)unitRegistry.getClone("starship");
        clone1.setHealth(10);
        clone2.setEquipment(new Equipment("Fire"));


        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(starship);
    }
}
