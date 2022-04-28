package com.joaomarcos.designpatter.decoratorpattern;

public abstract class Beverage 
{
    public String description(){
        return "I am a beverage.";
    }
    public abstract Integer cost();

    @Override
    public String toString() {
        return "Description: " + description() + " and Cost: " + cost();
    }
}
