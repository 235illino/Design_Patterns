package Creational.Builder;

import Creational.Builder.Builder.CargoBuilder;
import Creational.Builder.Builder.FighterBuilder;
import Creational.Builder.Builder.SpaceshipBuilder;
import Creational.Builder.Product.Spaceship;

public class ShipyardDirector {
    Spaceship constructStandardFighter(SpaceshipBuilder builder){
        builder.setEngine("standard Engine");
        builder.setHull("standard Hull");
        builder.addWeapons(true);
        builder.setCapacity(100);
        return builder.build();
    }

    static void main() {
        ShipyardDirector shipyardDirector = new ShipyardDirector();
        FighterBuilder fighterBuilder = new FighterBuilder();
        var fighterShip = shipyardDirector.constructStandardFighter(fighterBuilder);
        fighterShip.displaySpecs();
        CargoBuilder cargoBuilder = new CargoBuilder();
        cargoBuilder.setEngine("Cargo Engine");
        cargoBuilder.setCapacity(1000);
        var cargoShip = cargoBuilder.build();
        cargoShip.displaySpecs();
    }
}
