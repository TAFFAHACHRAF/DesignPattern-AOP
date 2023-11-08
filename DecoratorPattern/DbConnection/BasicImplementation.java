package DecoratorPattern.DbConnection;

public class BasicImplementation implements AbstractDbConnection{
    @Override
    public void connect() {
        System.out.println("Db connection");
    }
}
