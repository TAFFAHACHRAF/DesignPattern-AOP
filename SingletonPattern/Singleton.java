package SingletonPattern;


public class Singleton {
    private final static Singleton singleton;
    static {
        singleton=new Singleton();
    }
    private Singleton(){}
    public static Singleton getInstence(){
        return singleton;
    }
    private int data=2;
    public  void showData(){
        data ++;
        System.out.println(data);
    }
}