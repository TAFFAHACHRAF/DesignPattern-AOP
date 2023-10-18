package org.example.observer.solution;

public class ObserverImpl1 implements Observer{
    @Override
    public void update(Observable observable) {
        int result=(((ObservableImpl)observable).getEtat());
        System.out.println("----------------------Observer 1--------------");
        result=result*52+Math.max(result,89)+747;
        System.out.println("Result  : "+result);
        System.out.println("----------------------fin de calcule--------------");
    }
}
