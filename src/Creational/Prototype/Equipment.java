package Creational.Prototype;

public class Equipment implements Cloneable{
    private final String weaponName;

    public Equipment(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "weaponName='" + weaponName + '\'' +
                '}';
    }

    @Override
    public Equipment clone() {
        try {
            return (Equipment)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


}
