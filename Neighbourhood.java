public class Neighbourhood {
    public String name;
    public int minX;
    public int maxX;
    public int minY;
    public int maxY;
    public Neighbourhood(int minX , int maxX , int minY , int maxY , String name){
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.name = name;
    }
}
