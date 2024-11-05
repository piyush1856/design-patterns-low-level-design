package org.example.factory;

import org.example.factory.components.buttons.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UiFactory uiFactory = flutter.createUiFactory("Android");

        Button button = uiFactory.createButton();
        button.changeSize();

    }
}
