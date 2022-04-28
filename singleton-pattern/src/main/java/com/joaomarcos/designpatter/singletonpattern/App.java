package com.joaomarcos.designpatter.singletonpattern;

public class App 
{
    public static void main( String[] args )
    {
       
       // Create a single instance of SingleChanel class
       SingleChanel singleChanelA = SingleChanel.getInstance();

       SingleChanel singleChanelB = SingleChanel.getInstance();

       System.out.println("singleChanelA and singleChanelB are the same instance. singleChanelA == singleChanelB: " + singleChanelA.equals(singleChanelB));

    }
}
