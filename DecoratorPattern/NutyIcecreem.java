package DecoratorPattern;

public class NutyIcecreem extends IcecreemDecorator{
    public NutyIcecreem(Icecreem specialIcecreem) {
        super(specialIcecreem);
    }

    @Override
    public void makeIcecreem() {
        System.out.println("Login");
        specialIcecreem.makeIcecreem();
        System.out.println("Logout");
    }
}
