package com.joaomarcos.designpatter.decoratorpattern;

public class SoyAddOnBeverageDecorator extends AddOnBeverageDecorator 
{
    protected Beverage beverage;

    public SoyAddOnBeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public String description(){
        return beverage.description().concat(" And I have Soy addOn");
    }

    public Integer cost(){
        return beverage.cost()+3;
    }
}
