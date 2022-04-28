package com.joaomarcos.designpatter.abstractfactorypattern;

public class MacButton implements Button{

    @Override
    public String getToastOnHover(){
        return "I am a mac button";
    }

    @Override
    public String getSoundOnTap() {
        return "Tac";
    }

    @Override
    public String toString(){
        return "Button[" +
            " The hover: " + getToastOnHover() +
            " The Sound on tap: " + getSoundOnTap() +
        "]";
    }
}
