from components.button import Button
from components.button.AndroidButton import AndroidButton
from components.dropdown import Dropdown
from components.dropdown.AndroidDropdown import AndroidDropdown
from components.menu import Menu
from components.menu.AndroidMenu import AndroidMenu
from factories.UIComponentFactory import UIComponentFactory


class AndroidUIComponentFactory(UIComponentFactory):
    def create_button(self) -> Button:
        return AndroidButton()

    def create_dropdown(self) -> Dropdown:
        return AndroidDropdown()

    def create_menu(self) -> Menu:
        return AndroidMenu()