public class KDNodeBank{
    public Bank bank;
    public KDNodeBank left;
    public KDNodeBank right;
    public KDNodeBank(Bank bank){
        this.bank = bank;
        left = null;
        right = null;
    }
}