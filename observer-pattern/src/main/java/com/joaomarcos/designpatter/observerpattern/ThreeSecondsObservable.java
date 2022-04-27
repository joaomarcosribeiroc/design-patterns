package com.joaomarcos.designpatter.observerpattern;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ThreeSecondsObservable implements Observable {

    Set<Observer> observers = new HashSet<>();

    @Override
    public void add(Observer observer){
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer){
        observers.remove(observer);

    }

    @Override
    public Collection<Observer> getObservers(){
        return observers;
    }
}

