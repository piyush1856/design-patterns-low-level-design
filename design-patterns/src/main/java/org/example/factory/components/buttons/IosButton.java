package org.example.factory.components.buttons;

public class IosButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Changed size of Ios button");

    }
}
