package DecoratorPattern.DbConnection;

public abstract class DecoratorDbConnection implements AbstractDbConnection {
    private AbstractDbConnection abstractDbConnection;
    public DecoratorDbConnection(AbstractDbConnection abstractDbConnection){
        super();
        this.abstractDbConnection=abstractDbConnection;
    }
    @Override
    public void connect() throws InterruptedException {
        abstractDbConnection.connect();
    }
}
