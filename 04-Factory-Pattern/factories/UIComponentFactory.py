from abc import ABC, abstractmethod
from components.button import Button
from components.menu import Menu
from components.dropdown import Dropdown

class UIComponentFactory(ABC):

    @abstractmethod
    def create_button(self) -> Button:
        pass

    @abstractmethod
    def create_dropdown(self) -> Dropdown:
        pass

    @abstractmethod
    def create_menu(self) -> Menu:
        pass