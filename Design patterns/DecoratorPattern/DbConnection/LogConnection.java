package DecoratorPattern.DbConnection;

import java.util.Date;
import java.util.Map;

public class LogConnection extends DecoratorDbConnection{
    public LogConnection(AbstractDbConnection abstractDbConnection) {
        super(abstractDbConnection);
    }
    @Override
    public void connect() throws InterruptedException {
        Date date=new Date();
        System.out.println("Date after : "+date);
        super.connect();
        Thread.sleep(100);
        date=new Date();
        System.out.println("Date after : "+date);
    }
}
