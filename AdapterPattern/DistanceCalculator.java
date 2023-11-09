package AdapterPattern;

public class DistanceCalculator {
    public int calculateDistance(int x1,int y1,int x2,int y2){
        return (int) Math.sqrt(Math.pow(x1+x2,2)-Math.pow(y1+y2,2));
    }
}
