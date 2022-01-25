public class KDTreeBank {
    KDNodeBank root;

    public KDNodeBank getRoot(){
        return root;
    }

    public KDNodeBank insert(KDNodeBank root, Bank bank ,  int d) {
        if (root == null){
            return new KDNodeBank(bank);
        }

        int cd = d % 2;


        if (bank.Coordinates[cd] < (root.bank.Coordinates[cd])) {
            root.left = insert(root.left, bank, d + 1);
        }
        else{
            root.right = insert(root.right, bank, d + 1);
        }
        return root;
    }

    KDNodeBank insertNode(KDNodeBank root , Bank bank) {
        return insert(root, bank , 0);
    }

    public boolean search(KDNodeBank root, Bank bank, int d)
    {

        if (root == null){
            return false;
        }

        if (root.bank.Coordinates[0] == bank.Coordinates[0] && root.bank.Coordinates[1] == bank.Coordinates[1]){
            return true;
        }

        int cd = d % 2;


        if (bank.Coordinates[cd] < root.bank.Coordinates[cd]){
            return search(root.left, bank, d + 1);
        }

        return search(root.right, bank, d + 1);
    }


    public boolean searchNode(KDNodeBank root, Bank bank)
    {
        return search(root, bank , 0);
    }

    public KDNodeBank searchByName(KDNodeBank root , String bName){
        return searchByName(bName , root);
    }

    private KDNodeBank searchByName(String name, KDNodeBank root) {
        KDNodeBank result = null;

        if (root == null){
            return null;
        }

        if (root.bank.bankName.equals(name))
            return root;
        if (root.left != null){
            result = searchByName(name, root.left);
        }
        if (result == null){
            result = searchByName(name, root.right);
        }
        return result;
    }

    public void printKDtree(KDNodeBank node) {
        if (node == null)
            return;
        else {
            System.out.println("[ " + node.bank.Coordinates[0]
                    + " , " +node.bank.Coordinates[1] + " ]");
        }
        printKDtree(node.left);
        printKDtree(node.right);
    }

    

}