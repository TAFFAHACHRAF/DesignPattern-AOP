package org.example;

import org.example.observer.achraf_solution.Observable;
import org.example.observer.achraf_solution.Observer;
import org.example.observer.solution.ObservableImpl;
import org.example.observer.solution.ObserverImpl1;

public class Main {
    public static void main(String[] args) {
        // La technique de pull (poussé)
        /*Observable observable=new Observable();
        Observer observer1=new Observer();
        Observer observer2=new Observer();
        Observer observer3=new Observer();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setStat(8564);

        System.out.println(observable.getStat());
        System.out.println(observer1.getStat());
        System.out.println(observer2.getStat());
        System.out.println(observer3.getStat());*/
        ObservableImpl observable = new ObservableImpl();

        observable.addObserver(observer);
    }
}