package DecoratorPattern.DbConnection;

public interface AbstractDbConnection {
    void connect() throws InterruptedException;
}
