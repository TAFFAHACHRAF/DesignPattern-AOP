package TemplatePattern;

public abstract class Template {
    public void calculateXTS(){
        System.out.println(calculateX()*calculateT()*calculateS());
    }
    protected abstract int calculateX();
    protected abstract int calculateT();
    protected abstract int calculateS();
}
