from abc import ABC, abstractmethod

class Flyable(ABC):
    @abstractmethod
    def fly(self):
        pass

# Pigeon like bird has the same Flying Behaviour
# Eagle like bird has the same Flying behaviour