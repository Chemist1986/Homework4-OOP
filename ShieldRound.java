public class ShieldRound  extends Shield {

    @Override
    public Integer absorb() {
        return 15;
    } 
    
    @Override
    public String toString() {
        return String.format("ShildRound - %d", absorb());
    }
}