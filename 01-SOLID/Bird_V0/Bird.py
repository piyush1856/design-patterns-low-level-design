class Bird :
    def __init__(self, color, name, no_of_wings, bird_type):
        self.color = color
        self.name = name
        self.no_of_wings = no_of_wings
        self.type = bird_type

    def make_sound(self):
        pass

    def eat(self):
        pass

    def fly(self):
        if self.type == "Pigeon" :
            print("Pigeon id flying")
        elif self.type == "Sparrow":
            print("Sparrow is flying")

    # OCP Violation: Adding new bird types requires modifying the methods, breaking extensibility.
    # SRP Violation: This class handles sound, eat and fly (too many responsibility)

