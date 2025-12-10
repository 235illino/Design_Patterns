package Creational.Builder.Builder;

import Creational.Builder.Product.Spaceship;

public class FighterBuilder implements SpaceshipBuilder{
    private String engineType;
    private String hullMaterial;
    private boolean hasLaserCannons;
    private int crewCapacity;

    @Override
    public void setEngine(String type) {
        engineType = type;
    }

    @Override
    public void setHull(String material) {
        hullMaterial = material;
    }

    @Override
    public void addWeapons(boolean hasCannons) {
        hasLaserCannons = hasCannons;
    }

    @Override
    public void setCapacity(int count) {
        crewCapacity = count;
    }

    @Override
    public Spaceship build() {
        return new Spaceship(engineType, hullMaterial, hasLaserCannons, crewCapacity);
    }
}
