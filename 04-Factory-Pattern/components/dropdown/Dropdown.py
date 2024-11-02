from abc import ABC, abstractmethod

class Dropdown(ABC):

    @abstractmethod
    def content(self):
        pass