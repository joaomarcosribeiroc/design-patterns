package com.joaomarcos.designpatter.abstractfactorypattern;

public class MacUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
