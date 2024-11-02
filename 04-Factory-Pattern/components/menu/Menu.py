from abc import ABC, abstractmethod

class Menu(ABC):
    @abstractmethod
    def show(self):
        pass