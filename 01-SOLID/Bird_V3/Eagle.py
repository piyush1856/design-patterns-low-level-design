from Bird_V3.Bird import Bird
from Bird_V3.Flyable import Flyable
from Bird_V3.HighFlyBehaviour import HighFlyBehaviour


class Eagle(Bird, Flyable) :

    def __init__(self, color, name, no_of_wings, bird_type):
        super().__init__(color, name, no_of_wings, bird_type)
        self.fly_high_behaviour = HighFlyBehaviour()

    def fly(self):
        self.fly_high_behaviour.flyHigh()

    