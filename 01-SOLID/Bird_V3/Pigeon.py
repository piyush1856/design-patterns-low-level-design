from Bird_V3.Bird import Bird
from Bird_V3.Flyable import Flyable
from Bird_V3.FlyLowBehaviour import FlyLowBehaviour


class Pigeon(Bird, Flyable):

    def __init__(self, color, name, no_of_wings, bird_type):
        super().__init__(color, name, no_of_wings, bird_type)
        self.fly_low_behaviour = FlyLowBehaviour()

    def fly(self):
        self.fly_low_behaviour.fly_low()

    # Here if we want change flying behaviour we will have ti change it a lot of places
    # It is violation of dependency inversion principle, because two concrete classes are directly connected
    # In the nest package, will be solving this by introducing a interface / absract_class between the two classes