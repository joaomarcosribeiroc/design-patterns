package com.joaomarcos.designpatter.strategypattern;

import java.util.Objects;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Type something and press enter:\n");
        Scanner scanner = new Scanner(System.in);
        analyze(scanner.nextLine());
    }

    public static void analyze(String data){
        
        IAnalyzerStrategy analyzer = getAnalyzer(data);

        if(Objects.isNull(analyzer)){
            System.out.println("You typed something not numeric neither alphanumeric");
            return;
        }

        analyzer.analyze(data);
        
    }

    public static IAnalyzerStrategy getAnalyzer(String data){

        if(data.matches("\\d+")){
            return new NumericAnalyzerStrategy();
        }else if(data.matches("[A-za-z]+")){
            return new AlphanumericAnalyzerStrategy();
        }
        return null;
    }
}
