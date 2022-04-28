package com.joaomarcos.designpatter.decoratorpattern;

public class Decaf extends Beverage 
{
    @Override
    public String description(){
        return super.description().concat(" And I am also a decaf.");
    }
    public Integer cost(){
        return 4;
    }
}
