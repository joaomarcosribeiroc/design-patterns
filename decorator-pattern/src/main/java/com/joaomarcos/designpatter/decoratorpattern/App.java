package com.joaomarcos.designpatter.decoratorpattern;

public class App 
{
    public static void main( String[] args )
    {
       
       // Create a beverage of that is expresso and has caramel
        Beverage expresso = new Expresso();
        AddOnBeverageDecorator expressoWithCaramel = new CaramelAddOnBeverageDecorator(expresso);

        System.out.println(expressoWithCaramel);

       // Create a beverage of that is decaf and has soy
        Beverage decaf = new Decaf();
        AddOnBeverageDecorator decafWithSoy = new SoyAddOnBeverageDecorator(decaf);

        System.out.println(decafWithSoy);
    }
}
