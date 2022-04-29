package com.joaomarcos.designpatter.commandpattern;

public class App 
{
    public static void main( String[] args )
    {
        ICommand command = new Command("kafkaProducer");
        Invoker invoker = new Invoker(command);
        invoker.doStuff();
    }
}
