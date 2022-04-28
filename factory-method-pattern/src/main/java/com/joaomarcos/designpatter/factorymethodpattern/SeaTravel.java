package com.joaomarcos.designpatter.factorymethodpattern;

public class SeaTravel implements Travel{

    private String targetCity;

    public SeaTravel(String targetCity){
        this.targetCity = targetCity;
    }

    public String getTargetCity (){
        return this.targetCity;
    }
}
