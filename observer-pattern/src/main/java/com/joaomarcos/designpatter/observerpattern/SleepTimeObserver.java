package com.joaomarcos.designpatter.observerpattern;

public class SleepTimeObserver implements Observer {

    @Override
    public void observableNotifier() {
        System.out.println("Time to sleep");
    }

}

