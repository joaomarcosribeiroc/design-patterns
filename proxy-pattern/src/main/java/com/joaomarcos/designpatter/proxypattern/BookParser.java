package com.joaomarcos.designpatter.proxypattern;

public class BookParser implements IBookParser
{
    String parsedText;
    public BookParser(String text){
        //Havy computation to parse the book
        //text = this.parse(text)
        this.parsedText = text;
        System.out.println("Actually instatiating the BookParser with heavy task");
    }

    @Override
    public int getNumberOfPages() {
        System.out.println("Calling getNumberOfPages on BookParser");

        // Calculation that depends on a heavy computation to instatiate this class
        return parsedText.length();
    }
    
}