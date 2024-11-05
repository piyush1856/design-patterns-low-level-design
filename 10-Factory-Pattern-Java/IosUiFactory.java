package org.example.factory;

import org.example.factory.components.buttons.Button;
import org.example.factory.components.buttons.IosButton;
import org.example.factory.components.dropdowns.Dropdown;
import org.example.factory.components.dropdowns.IosDropdown;
import org.example.factory.components.menus.IosMenu;
import org.example.factory.components.menus.Menu;

public class IosUiFactory implements UiFactory{
    @Override
    public IosButton createButton() {
        System.out.println("Ios button created");
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        System.out.println("Ios menu created");
        return new IosMenu();
    }

    @Override
    public IosDropdown  createDropdown() {
        System.out.println("Ios dropdown created");
        return new IosDropdown();
    }
}
