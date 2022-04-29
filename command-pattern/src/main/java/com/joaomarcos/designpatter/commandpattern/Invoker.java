package com.joaomarcos.designpatter.commandpattern;

public class Invoker {

    //Fake one
    private ICommand command;
    
    //The necessary parameters to execute the command
    public Invoker(ICommand command){
        this.command = command;
    }


    public void doStuff(){
        command.execute();
        // Has discovered something wrong
        command.unexecute();
    }
}
