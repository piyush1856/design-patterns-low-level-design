from abc import ABC, abstractmethod

class FlyingBehaviour(ABC) :

    @abstractmethod
    def doFlying(self):
        pass