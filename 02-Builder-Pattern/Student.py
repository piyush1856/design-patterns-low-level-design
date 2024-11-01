class Student:

    def __init__(self, builder):
        self.id = builder.get_id()
        self.course = builder.get_course()
        self.name = builder.get_name()
        self.email = builder.get_email()

    @staticmethod
    def get_builder():
        return Student.Builder()

    def __str__(self):
        return f"Student(id={self.id}, name='{self.name}', course='{self.course}', email='{self.email}')"

    class Builder:
        def __init__(self):
            self._id = None
            self._course = None
            self._name = None
            self._email = None

        def set_id(self, _id: int):
            self._id = _id
            return self

        def set_course(self, _course: str):
            self._course = _course
            return self

        def set_name(self, _name: str):
            self._name = _name
            return self

        def set_email(self, _email: str):
            self._email = _email
            return self

        def get_id(self) -> int:
            return self._id

        def get_course(self) -> str:
            return self._course

        def get_name(self) -> str:
            return self._name

        def get_email(self) -> str:
            return self._email

        def validate(self):
            if self.get_course() is None:
                raise ValueError("Course is mandatory")
            if self.get_name() is None:
                raise ValueError("Name is mandatory")
            if self.get_id() is None:
                raise ValueError("ID is mandatory")

        def build(self):
            self.validate()
            return Student(self)
