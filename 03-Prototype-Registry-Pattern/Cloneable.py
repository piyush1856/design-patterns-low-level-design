from abc import ABC, abstractmethod
from typing import Generic, TypeVar

T = TypeVar("T")

class Cloneable(Generic[T], ABC):
    @abstractmethod
    def clone_obj(self) -> T:
        pass
