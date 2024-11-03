from abc import ABC, abstractmethod

class BankApi(ABC):

    @abstractmethod
    def check_balance(self) -> int:
        pass

    @abstractmethod
    def transfer(self, amt: int, to: int) -> bool:
        pass