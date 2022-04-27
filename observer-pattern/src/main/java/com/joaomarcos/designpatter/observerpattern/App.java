package com.joaomarcos.designpatter.observerpattern;

public class App 
{
    public static void main( String[] args )
    {
       Observable observable = new ThreeSecondsObservable();

       observable.add(new SleepTimeObserver());
       observable.add(new LunchTimeObserver());

       observable.notifyObservers();
    }
}
