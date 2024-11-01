from abc import ABC, abstractmethod
from typing import Generic, TypeVar

T = TypeVar("T")


class Builder(ABC, Generic[T]):

    @abstractmethod
    def build(self) -> T:
        pass