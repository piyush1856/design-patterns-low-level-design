from Beverage import Beverage


class HouseBlend(Beverage):
    def cost(self) -> int:
        return 99

    def get_desc(self) -> str:
        return "house blend"