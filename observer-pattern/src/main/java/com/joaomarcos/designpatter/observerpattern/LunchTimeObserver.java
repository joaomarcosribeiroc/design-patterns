package com.joaomarcos.designpatter.observerpattern;

public class LunchTimeObserver implements Observer {

    @Override
    public void observableNotifier() {
        System.out.println("Time to lunch");
    }

}

