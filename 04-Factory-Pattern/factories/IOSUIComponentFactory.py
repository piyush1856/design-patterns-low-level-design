from components.button import Button
from components.button.IOSButton import IOSButton
from components.dropdown import Dropdown
from components.dropdown.IOSDropdown import IOSDropdown
from components.menu import Menu
from components.menu.IOSMenu import IOSMenu
from factories.UIComponentFactory import UIComponentFactory


class IOSUIComponentFactory(UIComponentFactory):
    def create_button(self) -> Button:
        return IOSButton()

    def create_dropdown(self) -> Dropdown:
        return IOSDropdown()

    def create_menu(self) -> Menu:
        return IOSMenu()