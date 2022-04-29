package com.joaomarcos.designpatter.commandpattern;

public class Command implements ICommand{

    //Fake one
    private String kafkaProducerReceiver;
    
    //The necessary parameters to execute the command
    public Command(String kafkaProducerReceiver){
        this.kafkaProducerReceiver = kafkaProducerReceiver;
    }


    @Override
    public void execute(){
        System.out.println("Hey I am producing an event");
    }
    
    @Override
    public void unexecute(){
        System.out.println("Hey I am producing another event cancelling the previous one") ;
    }
}
