package com.joaomarcos.designpatter.abstractfactorypattern;

public class WindowsUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}