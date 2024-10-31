from Bird_V1.Bird import Bird


class Penguin(Bird):
    def fly(self):
        # Raise an exception or do nothing as penguins cannot fly
        # Violation of liskov substitution principle
        raise NotImplementedError("Penguins cannot fly")

    def make_sound(self):
        pass