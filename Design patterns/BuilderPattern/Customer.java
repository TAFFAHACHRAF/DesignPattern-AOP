package BuilderPattern;

public class Customer implements Cloneable{
    private String name;
    private String surname;

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }
}
