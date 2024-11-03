from abc import ABC, abstractmethod

class Beverage(ABC):

    @abstractmethod
    def cost(self) -> int:
        pass

    @abstractmethod
    def get_desc(self) -> str:
        pass