public abstract class Warrior<T extends Weapon, E extends Protection> {
    private String name;
    private T weapon;
    private E protection;
     private Integer healthPoint;
    
    public Warrior(String name, T weapon, E protection, Integer healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.protection = protection;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }

    public E getProtection() {
        return protection;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %d", name, weapon, protection, healthPoint);
    }
}
