package com.joaomarcos.designpatter.decoratorpattern;

public class Expresso extends Beverage 
{
    @Override
    public String description(){
        return super.description().concat(" And I am also a expresso.");
    }
    public Integer cost(){
        return 3;
    }
}
