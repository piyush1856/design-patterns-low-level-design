from Bird_V2.Bird import Bird
from Bird_V2.Flyable import Flyable

class Eagle(Bird, Flyable) :

    def fly(self):
        print("We are flying High")

    