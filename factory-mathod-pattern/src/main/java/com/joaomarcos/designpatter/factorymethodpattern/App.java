package com.joaomarcos.designpatter.factorymethodpattern;

public class App 
{
    public static void main( String[] args )
    {
        TravelFactory travelFactory = new SouthAfricaTravelFactory();

        Travel travel = travelFactory.createTravel("some fake Parameters");

        System.out.println("Base on the parameters, we encountered the following cities to travel: " +  travel.getTargetCity() );
    }
}
