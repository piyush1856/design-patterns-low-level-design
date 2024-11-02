from abc import ABC, abstractmethod
from typing import Optional

from User import User, UserType


class Registry(ABC):
    @abstractmethod
    def add_prototype(self, user: User) -> None:
        pass

    @abstractmethod
    def get_prototype(self, type_: UserType) -> Optional[User]:
        pass

    @abstractmethod
    def clone(self, type_: UserType) -> Optional[User]:
        pass