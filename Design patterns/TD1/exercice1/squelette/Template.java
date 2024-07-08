package TD1.exercice1.squelette;

import java.util.Date;

public abstract class Template {
    public void showDate(){
        showHead();
        System.out.println(new Date());
        showBottom();
    }
    protected abstract void showHead();
    protected abstract void showBottom();
}
