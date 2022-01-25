public class KDTreeBankBranch {
    KDNodeBankBranch root;


    public KDNodeBankBranch insert(KDNodeBankBranch root, BankBrarnch bankBrarnch ,  int d) {
        if (root == null){
            return new KDNodeBankBranch(bankBrarnch);
        }

        int cd = d % 2;


        if (bankBrarnch.Coordinates[cd] < (root.bankBrarnch.Coordinates[cd])) {
            root.left = insert(root.left, bankBrarnch , d + 1);
        }
        else{
            root.right = insert(root.right, bankBrarnch , d + 1);
        }
        return root;
    }

    KDNodeBankBranch insertNode(KDNodeBankBranch root , BankBrarnch bankBrarnch) {
        return insert(root, bankBrarnch , 0);
    }

    boolean search(KDNodeBankBranch root, Bank bank, int d)
    {

        if (root == null){
            return false;
        }

        if (root.bankBrarnch.Coordinates[0] == bank.Coordinates[0] && root.bankBrarnch.Coordinates[1] == bank.Coordinates[1]){
            return true;
        }

        int cd = d % 2;


        if (bank.Coordinates[cd] < root.bankBrarnch.Coordinates[cd]){
            return search(root.left, bank, d + 1);
        }

        return search(root.right, bank, d + 1);
    }


    boolean searchNode(KDNodeBankBranch root, Bank bank)
    {
        return search(root, bank , 0);
    }

}