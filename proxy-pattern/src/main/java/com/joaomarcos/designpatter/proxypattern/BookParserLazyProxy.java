package com.joaomarcos.designpatter.proxypattern;

public class BookParserLazyProxy implements IBookParser
{
    String notParsedText;
    IBookParser bookParser = null;

    public BookParserLazyProxy(String text){
        //We will not parse the text here
        this.notParsedText = text;
        System.out.println("Actually instatiating the BookParserLazyProxy.");

    }

    @Override
    public int getNumberOfPages() {
        System.out.println("Calling getNumberOfPages on BookParserLazyProxy");

        if(bookParser == null){
            bookParser = new BookParser(notParsedText);
        }

        return bookParser.getNumberOfPages();
    }

}
