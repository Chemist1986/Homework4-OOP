public class Shield implements Protection {
    @Override
    public Integer absorb() {
        return 10;
    } 

    @Override
    public String toString() {
        return String.format("Shild - %d", absorb());
    }
}