package Creational.Builder.Product;

public class Spaceship {
    private final String engineType;
    private final String hullMaterial;
    private final boolean hasLaserCannons;
    private final int crewCapacity;

    //intended for use by Builder classes only
    public Spaceship(String engineType, String hullMaterial, boolean hasLaserCannons, int crewCapacity) {
        this.engineType = engineType;
        this.hullMaterial = hullMaterial;
        this.hasLaserCannons = hasLaserCannons;
        this.crewCapacity = crewCapacity;
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
