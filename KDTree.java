/*public class KDTree {
    KDNode root;


    public KDNode insert(KDNode root, int[] points ,  int d) {
        if (root == null){
            return new KDNode(points);
        }

        int cd = d % 2;


        if (points[cd] < (root.points[cd])) {
            root.left = insert(root.left, points, d + 1);
        }
        else{
            root.right = insert(root.right, points, d + 1);
        }
        return root;
    }

    KDNode insertNode(KDNode root , int[] points) {
        return insert(root, points , 0);
    }

    boolean search(KDNode root, int[] points, int d)
    {

        if (root == null){
            return false;
        }

        if (root.points[0] == points[0] && root.points[1] == points[1]){
            return true;
        }

        int cd = d % 2;


        if (points[cd] < root.points[cd]){
            return search(root.left, points, d + 1);
        }

        return search(root.right, points, d + 1);
    }


    boolean searchNode(KDNode root, int point[])
    {
        return search(root, point, 0);
    }

}*/
