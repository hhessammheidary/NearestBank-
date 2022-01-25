public class KDNodeBankBranch{
    public BankBrarnch bankBrarnch;
    public KDNodeBankBranch left;
    public KDNodeBankBranch right;
    public KDNodeBankBranch(BankBrarnch bankBrarnch){
        this.bankBrarnch = bankBrarnch;
        left = null;
        right = null;
    }
}