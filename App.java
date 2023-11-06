import DecoratorPattern.BaseIcecreem;
import DecoratorPattern.Icecreem;
import DecoratorPattern.NutyIcecreem;
import ObserverPattern.ObservableImpl;
import ObserverPattern.ObserverImpl;
import TD1.exercice1.figure.Cercle;
import TD1.exercice1.figure.Figure;
import TD1.exercice1.figure.GroupFigure;
import TD1.exercice1.figure.Rectangle;
import TD1.exercice1.squelette.Template;
import TD1.exercice1.squelette.TemplateImpl1;
import TD1.exercice1.squelette.TemplateImpl2;

public class App {
    public static void main(String args[]){
        /*Directory directory=new Directory();
        directory.addComposant(new File());
        for(Composant c : directory.getComposants()){
            c.open();
        }*/
        /*ObservableImpl observable=new ObservableImpl();
        ObserverImpl observer=new ObserverImpl();
        observable.setState(687);
        observable.addObserver(observer);
        observable.setState(654);
        System.out.println(observer.getState());*/
        /*Icecreem icecreem = new NutyIcecreem(new NutyIcecreem(new BaseIcecreem()));
        icecreem.makeIcecreem();*/
        /*Template templateImpl1=new TemplateImpl1();
        templateImpl1.calculateXTS();
        templateImpl1=new TemplateImpl2();
        templateImpl1.calculateXTS();*/
        /*Figure cercle=new Cercle();
        Figure rectangle=new Rectangle();
        GroupFigure group=new GroupFigure();
        group.addFigure(cercle);
        group.addFigure(rectangle);
        group.addFigure(new GroupFigure());
        for(Figure figure: group.getFigures()){
            figure.show();
        }*/
        Template template=new TemplateImpl1();
        template.showDate();
        template=new TemplateImpl2();
        template.showDate();
    }
}