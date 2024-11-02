from factories.IOSUIComponentFactory import IOSUIComponentFactory
from factories.UIComponentFactory import UIComponentFactory
from platform.Platform import Platform


class IOS(Platform):
    def create_ui_component_factory(self) -> UIComponentFactory:
        return IOSUIComponentFactory()