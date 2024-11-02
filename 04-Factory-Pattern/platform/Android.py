from factories.AndroidUIComponentFactory import AndroidUIComponentFactory
from factories.UIComponentFactory import UIComponentFactory
from platform.Platform import Platform


class Android(Platform):
    def create_ui_component_factory(self) -> UIComponentFactory:
        return AndroidUIComponentFactory()