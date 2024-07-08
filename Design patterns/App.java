import AdapterPattern.Adapter;
import AdapterPattern.Standard;
import AdapterPattern.StandartImpl;
import DecoratorPattern.BaseIcecreem;
import DecoratorPattern.DbConnection.AbstractDbConnection;
import DecoratorPattern.DbConnection.BasicImplementation;
import DecoratorPattern.DbConnection.LogConnection;
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
    public static void main(String args[]) throws InterruptedException {
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
        /*Template template=new TemplateImpl1();
        template.showDate();
        template=new TemplateImpl2();
        template.showDate();*/
        /*Icecreem baseIcecreem=new BaseIcecreem();
        baseIcecreem.makeIcecreem();
        System.out.println("---------------------");
        baseIcecreem=new NutyIcecreem(new BaseIcecreem());
        baseIcecreem.makeIcecreem();*/
        /*AbstractDbConnection abstractDbConnection=new BasicImplementation();
        abstractDbConnection.connect();
        abstractDbConnection=new LogConnection(abstractDbConnection);
        abstractDbConnection.connect();*/
        /*Standard standard=new StandartImpl();
        System.out.println(standard.calculateDistance(10,10,20,20));
        standard=new Adapter();
        System.out.println(standard.calculateDistance(10,10,20,20));*/
        ImmutableExample immutableExample=new ImmutableExample();
        //immutableExample.afficher();
        immutableExample.getList().add(784);
        immutableExample.afficher();
    }
}