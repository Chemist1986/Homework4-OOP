public class ShieldBig extends ShieldRound{

    @Override
    public Integer absorb() {
        return 20;
    }
    
    @Override
    public String toString() {
        return String.format("ShildBig - %d", absorb());
    }
}
