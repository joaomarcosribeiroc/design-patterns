package com.joaomarcos.designpatter.proxypattern;

public class App 
{
    public static void main( String[] args )
    {
        IBookParser bookParser = new BookParserLazyProxy("huge text");
        bookParser.getNumberOfPages();      
    }
}
