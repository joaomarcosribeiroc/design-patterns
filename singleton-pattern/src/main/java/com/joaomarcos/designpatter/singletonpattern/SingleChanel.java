package com.joaomarcos.designpatter.singletonpattern;

public class SingleChanel 
{

    private SingleChanel(){}

    private static SingleChanel instance;
    
    public static SingleChanel getInstance(){
        if(instance == null){
            instance = new SingleChanel();
        }
        return instance;
    }
}
