public class Bank {
    String bankName;
    KDTreeBankBranch bankBrarnches;
    int[] Coordinates;

    public Bank(int[] coordinates , String bName){
        this.bankName = bName;
        this.Coordinates = coordinates;
        this.bankBrarnches = new KDTreeBankBranch();
    }
}
