from typing import Optional, Dict

from User import User, UserType
from Registry import Registry

class RegistryImpl(Registry):
    def __init__(self):
        self.prototypes: Dict[UserType, User] = {}

    def add_prototype(self, user: User) -> None:
        self.prototypes[user.user_type] = user

    def get_prototype(self, type_: UserType) -> Optional[User]:
        return self.prototypes.get(type_)

    def clone(self, type_: UserType) -> Optional[User]:
        return (
            self.prototypes[type_].clone_obj() if type_ in self.prototypes else None
        )