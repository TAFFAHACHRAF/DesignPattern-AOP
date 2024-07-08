package TemplatePattern;

public class TemplateImpl2 extends Template{

    @Override
    public int calculateX() {
        return (int) (Math.random() % 10 + 74 / 7 + 0.5 * Math.random());
    }

    @Override
    public int calculateT() {
        return (int) (Math.random() % 12 + 74 / 7 + 0.5 * Math.random());
    }

    @Override
    public int calculateS() {
        return (int) (Math.random() % 14 + 74 / 7 + 0.5 * Math.random());
    }
}
