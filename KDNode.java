public class KDNode {
    public int x;
    public int y;
    public KDNode parent;
    public KDNode left;
    public KDNode right;
    public boolean upSideDown;
    public KDNode(int x , int y){
        this.x = x;
        this.y = y;
        parent = null;
        left = null;
        right = null;
    }

    public KDNode(int x , int y , KDNode parent){
        this.x = x;
        this.y = y;
        this.parent = parent;
        left = null;
        right = null;
    }

    public void setUpSideDown(boolean upSideDown) {
        this.upSideDown = upSideDown;
    }
}
