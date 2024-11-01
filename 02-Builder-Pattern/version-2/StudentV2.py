from dataclasses import dataclass
from Builder_ import Builder


@dataclass
class StudentV2 :
    roll: int
    s_name: str
    section: str

    @staticmethod
    def builder() -> "StudentV2.StudentBuilder":
        return StudentV2.StudentBuilder()

    class StudentBuilder(Builder["StudentV2"]):
        def __init__(self):
            self._instance = StudentV2(None, None, None)

        def build(self) -> "StudentV2":
            return self._instance


        def roll(self, roll: int) -> "StudentV2.StudentBuilder":
            self._instance.roll = roll
            return self

        def s_name(self, s_name: str) -> "StudentV2.StudentBuilder":
            self._instance.s_name = s_name
            return self

        def section(self, section: str) -> "StudentV2.StudentBuilder":
            self._instance.section = section
            return self
