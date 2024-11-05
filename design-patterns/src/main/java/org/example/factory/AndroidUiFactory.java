package org.example.factory;

import org.example.factory.components.buttons.AndroidButton;
import org.example.factory.components.buttons.Button;
import org.example.factory.components.dropdowns.AndroidDropdown;
import org.example.factory.components.dropdowns.Dropdown;
import org.example.factory.components.menus.AndroidMenu;
import org.example.factory.components.menus.Menu;

public class AndroidUiFactory implements UiFactory{
    @Override
    public AndroidButton createButton() {
        System.out.println("Android button created");
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        System.out.println("Android menu created");
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        System.out.println("Android dropdown created");
        return new AndroidDropdown();
    }
}
