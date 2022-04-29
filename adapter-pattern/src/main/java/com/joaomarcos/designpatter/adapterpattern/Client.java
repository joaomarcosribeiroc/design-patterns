package com.joaomarcos.designpatter.adapterpattern;

public class Client
{
    private final ITarget target;

    public Client(ITarget target){
        this.target = target;
    }

    public void speak(){
        target.speak();
    }

}
