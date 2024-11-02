from abc import ABC, abstractmethod
from factories.UIComponentFactory import UIComponentFactory


class Platform(ABC):

    def refresh_rate(self):
        print("Refreshing")

    def do_something(self):
        print("Doing Something From Platform")

    @staticmethod
    def create_platform(input_: str) -> "Platform":
        if input_ == 'android':
            from platform.Android import Android
            return Android()
        elif input_ == 'ios':
            from platform.IOS import IOS
            return IOS()
        else:
            return None

    @abstractmethod
    def create_ui_component_factory(self) -> UIComponentFactory:
        pass
