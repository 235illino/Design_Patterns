package Creational.Builder.Builder;

import Creational.Builder.Product.Spaceship;

public interface SpaceshipBuilder {

    void setEngine(String type);

    void setHull(String material);

    void addWeapons(boolean hasCannons);

    void setCapacity(int count);

    Spaceship build();
}
