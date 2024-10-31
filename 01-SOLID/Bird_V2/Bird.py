from abc import ABC, abstractmethod

class Bird(ABC) :
    def __init__(self, color, name, no_of_wings, bird_type):
        self.color = color
        self.name = name
        self.no_of_wings = no_of_wings
        self.type = bird_type

    def eat(self):
        print("The Bird is eating")