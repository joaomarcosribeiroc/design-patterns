package com.joaomarcos.designpatter.adapterpattern;

public class App 
{
    public static void main( String[] args )
    {
      
        Client client = new Client(new Adapter(new Adaptee()));

        System.out.println("The client couldn't speak in french, but now it is possible using the adapter:");
        client.speak();
    }
}
