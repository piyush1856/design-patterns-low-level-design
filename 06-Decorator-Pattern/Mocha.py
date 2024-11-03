from Addon import Addon
from Beverage import Beverage


class Mocha(Addon):
    def __init__(self, beverage: Beverage):
        self.beverage = beverage

    def cost(self) -> int:
        return self.beverage.cost() + 43

    def get_desc(self) -> str:
        return self.beverage.get_desc() + " " + "mocha"

