from abc import ABC, abstractmethod

class PathCalculatorStrategy(ABC):

    @abstractmethod
    def find_path(self):
        pass