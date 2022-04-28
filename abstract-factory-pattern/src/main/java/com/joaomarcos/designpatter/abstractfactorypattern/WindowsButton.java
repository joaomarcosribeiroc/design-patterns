package com.joaomarcos.designpatter.abstractfactorypattern;

public class WindowsButton implements Button{

    @Override
    public String getToastOnHover(){
        return "I am a windows button";
    }

    @Override
    public String getSoundOnTap() {
        return "Tiin";
    }

    @Override
    public String toString(){
        return "Button[" +
            " The hover: " + getToastOnHover() +
            " The Sound on tap: " + getSoundOnTap() +
        "]";
    }
}
