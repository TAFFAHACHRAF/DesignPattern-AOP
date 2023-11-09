package AdapterPattern;

public class StandartImpl implements Standard{
    @Override
    public int calculateDistance(int x1, int y1,int x2, int y2) {
        return Math.abs((x1+y1)-(y1+y2));
    }
}
