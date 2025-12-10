package Creational.Builder.Product;

public class Spaceship {
    private String engineType;
    private String hullMaterial;
    private boolean hasLaserCannons;
    private int crewCapacity;

    //intended for use by Builder classes only
    public Spaceship(String engineType, String hullMaterial, boolean hasLaserCannons, int crewCapacity) {
        this.engineType = engineType;
        this.hullMaterial = hullMaterial;
        this.hasLaserCannons = hasLaserCannons;
        this.crewCapacity = crewCapacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public boolean isHasLaserCannons() {
        return hasLaserCannons;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }


    public void displaySpecs() {
        System.out.println("Spaceship{" +
                "engineType='" + engineType + '\'' +
                ", hullMaterial='" + hullMaterial + '\'' +
                ", hasLaserCannons=" + hasLaserCannons +
                ", crewCapacity=" + crewCapacity +
                '}');
    }
}
