package TemplatePattern;

public class TemplateImpl1 extends Template{

    @Override
    public int calculateX() {
        return (int) (Math.random() % 85 + 74 / 7 + 0.5 * Math.random());
    }

    @Override
    public int calculateT() {
        return (int) (Math.random() % 96 + 74 / 7 + 0.5 * Math.random());
    }

    @Override
    public int calculateS() {
        return (int) (Math.random() % 74 + 74 / 7 + 0.5 * Math.random());
    }
}
