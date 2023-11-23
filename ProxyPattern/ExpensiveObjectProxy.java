package ProxyPattern;

public class ExpensiveObjectProxy extends ExpensiveObject{
    ExpensiveObject expensiveObject=new ExpensiveObjectImpl();
    @Override
    protected void process() {
        System.out.println("Vérification");
        expensiveObject.process();
    }
}
