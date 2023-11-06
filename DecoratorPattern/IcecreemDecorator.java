package DecoratorPattern;

public abstract class IcecreemDecorator implements Icecreem {
    protected Icecreem specialIcecreem;
    public IcecreemDecorator(Icecreem specialIcecreem){
        this.specialIcecreem=specialIcecreem;
    }
    public void makeIcecreem(){
        specialIcecreem.makeIcecreem();
    }
}
