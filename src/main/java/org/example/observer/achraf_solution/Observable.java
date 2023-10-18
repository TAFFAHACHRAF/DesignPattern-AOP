package org.example.observer.achraf_solution;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private int stat;
    private List<Observer> observers=new ArrayList<>();
    public Observable(){
        this.stat=0;
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
        for (Observer observer : observers) {
            observer.setStat(this.stat);
        }
    }
}
