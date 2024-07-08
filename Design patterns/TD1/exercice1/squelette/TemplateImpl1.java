package TD1.exercice1.squelette;

public class TemplateImpl1 extends Template{
    @Override
    protected void showHead() {
        System.out.println("Head");
    }

    @Override
    protected void showBottom() {
        System.out.println("Bottom");
    }
}
