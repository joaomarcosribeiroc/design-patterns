package com.joaomarcos.designpatter.abstractfactorypattern;

public class App 
{
    public static void main( String[] args )
    {
        UIFactory uiFactory = new MacUIFactory();
        Button button = uiFactory.createButton(); // this is a mac button 
        
        UIFactory uiFactory_ = new WindowsUIFactory();
        Button button_ = uiFactory_.createButton(); // this is a windows button 

        System.out.println("Buttons created with MacFactory implementation under the hood: " + button);
        System.out.println("Buttons created with MacFactory implementation under the hood: " + button_);
    }
}
