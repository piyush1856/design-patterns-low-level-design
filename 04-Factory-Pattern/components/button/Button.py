from abc import ABC, abstractmethod

class Button(ABC):

    @abstractmethod
    def draw(self):
        pass