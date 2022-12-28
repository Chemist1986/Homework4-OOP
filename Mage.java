public class Mage extends Warrior<Staff, ShieldBig> {
    
    private Integer range;
    private Integer mana; 
    private Integer protect;

    public Mage(String name, Staff weapon, ShieldBig protection, Integer healthPoint, Integer range, Integer mana, Integer protect) {
        super(name, weapon, protection, healthPoint);
        this.range = range;
        this.mana = mana;
        this.protect = protect;
    }

    @Override
    public String toString() {
        return String.format("Mage - %s, mana - %d, range - %d, protection - %d", super.toString(), mana, range, protect);
    }
}
