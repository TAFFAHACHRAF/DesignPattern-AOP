package ProxyPattern;

public class Client {
    public static void main(String[] args){
        ExpensiveObjectProxy expensiveObjectProxy=new ExpensiveObjectProxy();
        expensiveObjectProxy.process();
    }
}
