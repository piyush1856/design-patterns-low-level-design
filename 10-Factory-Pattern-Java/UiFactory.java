package org.example.factory;

import org.example.factory.components.buttons.Button;
import org.example.factory.components.dropdowns.Dropdown;
import org.example.factory.components.menus.Menu;

public interface UiFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();
}
