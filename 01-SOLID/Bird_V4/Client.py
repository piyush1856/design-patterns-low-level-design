from Bird_V4.Eagle import Eagle
from Bird_V4.HighFlyBehaviour import HighFlyBehaviour
from Bird_V4.FlyLowBehaviour import FlyLowBehaviour
from Bird_V4.Pigeon import Pigeon




if __name__ == '__main__':
    flying_behaviour = FlyLowBehaviour()
    pigeon = Pigeon("BLack", "Pigeon-1", 2, "small", flying_behaviour)
    pigeon.fly()

    pigeon.set_flying_behaviour(HighFlyBehaviour())
    pigeon.fly()

    eagle = Eagle("Brown", "Eagle-1", 2, "Big", HighFlyBehaviour())
    eagle.fly()



