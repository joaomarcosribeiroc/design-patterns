package com.joaomarcos.designpatter.adapterpattern;

public class Adapter implements ITarget 
{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void speak() {
        adaptee.speakInFrench();
    }
}
