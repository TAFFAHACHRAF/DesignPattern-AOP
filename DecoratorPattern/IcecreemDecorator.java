package DecoratorPattern;

public abstract class IcecreemDecorator implements Icecreem {
    protected Icecreem specialIcecreem;
    public IcecreemDecorator(Icecreem specialIcecreem) {
        super();
        this.specialIcecreem = specialIcecreem;
    }
}
