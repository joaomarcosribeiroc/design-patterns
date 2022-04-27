package com.joaomarcos.designpatter.strategypattern;

public class NumericAnalyzerStrategy implements IAnalyzerStrategy{

    @Override
    public void analyze(String data){
        Integer parsedData = Integer.parseInt(data);
        Integer limit = 10; 
        if(parsedData > limit)
            System.out.println("You typed a number bigger than " + limit);
        else
            System.out.println("You typed a number smaller than " + limit);
    }
}

