package com.joaomarcos.designpatter.strategypattern;

public class AlphanumericAnalyzerStrategy  implements IAnalyzerStrategy{

    @Override
    public void analyze(String data){

        Integer limit = 10; 
        if(data.length() > limit)
            System.out.println("You typed alphanumeric data longer than " + limit);
        else
            System.out.println("You typed alphanumeric data shorter than " + limit);
    }
}

