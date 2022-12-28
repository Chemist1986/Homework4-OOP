public class Archer extends Warrior<Bow, Shield> {

    private Integer range;
    private Integer protect;

    public Archer(String name, Bow weapon, Shield protection, Integer healthPoint, Integer range, Integer protect) {
        super(name, weapon, protection, healthPoint);
        this.range = range;
        this.protect = protect;
    }

    public Integer getRange() {
        return range;
    }
    
    @Override
    public String toString() {
        return String.format("Archer - %s, range - %d, protection - %d", super.toString(), range, protect);
    }
}