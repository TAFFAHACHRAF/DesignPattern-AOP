package org.example.observer.solution;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private int etat=10;
    private List<Observer> observers=new ArrayList<>();

    @Override
    public void addObserver(Observer obs) {
        this.observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        this.observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(this);
        }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifyObservers();
    }
}
