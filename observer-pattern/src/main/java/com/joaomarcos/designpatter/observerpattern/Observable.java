package com.joaomarcos.designpatter.observerpattern;

import java.util.Collection;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    Collection<Observer> getObservers();
    default void notifyObservers(){
        while(true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Notifying Observers");
            getObservers().stream().forEach(obs -> {
                obs.observableNotifier();
            });
        }
    }
}

