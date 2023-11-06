package DecoratorPattern;

public class NutyIcecreem extends IcecreemDecorator{

    public NutyIcecreem(Icecreem specialIcecreem) {
        super(specialIcecreem);
    }

    public void makeIcecreem() {
        super.makeIcecreem();
        System.out.println("Nuty");
    }
}
