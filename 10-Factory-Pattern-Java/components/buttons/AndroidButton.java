package org.example.factory.components.buttons;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("Changed size of Android button");
    }
}
