package AdapterPattern;

public class Adapter implements Standard{
    DistanceCalculator distanceCalculator;
    public Adapter(){
        distanceCalculator=new DistanceCalculator();
    }
    @Override
    public int calculateDistance(int x1, int y1,int x2, int y2) {
        return distanceCalculator.calculateDistance(x1,y1,x2,y2);
    }
}
