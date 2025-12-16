package Creational.Prototype;

public class Starship implements Unit{
    private int id;
    private int health;
    private Equipment equipment;

    public Starship(int id, int health, Equipment equipment) {
        this.id = id;
        this.health = health;
        this.equipment = equipment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public Unit clone() {
        try {
            Starship clone = (Starship) super.clone();
            // РЕАЛІЗАЦІЯ ГЛИБОКОГО КОПІЮВАННЯ:
            // Клонуємо посилальний об'єкт Equipment, а не просто копіюємо посилання
            clone.equipment = this.equipment.clone(); // Якщо Equipment також Cloneable
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Starship{" +
                "id=" + id +
                ", health=" + health +
                ", equipment=" + equipment +
                '}';
    }
}
