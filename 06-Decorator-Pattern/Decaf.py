from Beverage import Beverage


class Decaf(Beverage):
    def cost(self) -> int:
        return 100

    def get_desc(self) -> str:
        return "decaf"