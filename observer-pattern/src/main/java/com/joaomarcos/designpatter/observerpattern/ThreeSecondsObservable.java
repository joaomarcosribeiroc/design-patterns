package com.joaomarcos.designpatter.observerpattern;

import java.util.HashSet;
import java.util.Set;

public class ThreeSecondsObservable implements Observable {

    Set<Observer> observers = new HashSet<>();

    public ThreeSecondsObservable(){

    }
    
    public void add(Observer observer){
        observers.add(observer);
    }
    public void remove(Observer observer){
        observers.remove(observer);

    }
    public void notifyObservers(){
        while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Notifying Observers");
            observers.stream().forEach(obs -> {
                obs.observableNotifier();
            });
        }
    }
}

