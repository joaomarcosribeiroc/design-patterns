package com.joaomarcos.designpatter.factorymethodpattern;

public class  SouthAfricaTravelFactory implements TravelFactory{

    public Travel createTravel(String someParameters){
        //Some computations in order to discover the best travel acording to parameters
        return new SeaTravel("Cape Town");
    }

}
