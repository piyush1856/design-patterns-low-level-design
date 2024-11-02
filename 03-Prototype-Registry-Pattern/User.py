from dataclasses import dataclass
from enum import Enum
from copy import deepcopy

from Cloneable import Cloneable


class UserType(Enum):
    ADMIN = "admin"
    SUB_ADMIN = "sub_admin"
    OEM = "oem"

@dataclass
class User(Cloneable["User"]):
    user_id: int
    user_name: str
    user_type: UserType

    def clone_obj(self) -> "User":
        return deepcopy(self)



