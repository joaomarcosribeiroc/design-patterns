package com.joaomarcos.designpatter.decoratorpattern;

public class CaramelAddOnBeverageDecorator extends AddOnBeverageDecorator 
{
    protected Beverage beverage;

    public CaramelAddOnBeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public String description(){
        return beverage.description().concat(" And I have Caramel addOn");
    }

    public Integer cost(){
        return beverage.cost()+2;
    }
}
