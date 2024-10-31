from Bird_V4.Bird import Bird
from Bird_V4.Flyable import Flyable
from Bird_V4.FlyLowBehaviour import FlyLowBehaviour


class Pigeon(Bird, Flyable):

    def __init__(self, color, name, no_of_wings, bird_type, flying_behaviour):
        super().__init__(color, name, no_of_wings, bird_type)
        self.flying_behaviour = flying_behaviour

    def fly(self):
        self.flying_behaviour.doFlying()

    def set_flying_behaviour(self, flying_behaviour):
        self.flying_behaviour = flying_behaviour