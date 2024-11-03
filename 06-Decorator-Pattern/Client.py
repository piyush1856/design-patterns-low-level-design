from Decaf import Decaf
from Milk import Milk
from Mocha import Mocha

if __name__ == '__main__':

    beverage = Decaf()
    print(beverage.get_desc())
    print(beverage.cost())

    beverage_with_milk = Milk(beverage)
    print(beverage_with_milk.get_desc())
    print(beverage_with_milk.cost())

    beverage_with_milk_and_mocha = Mocha(beverage_with_milk)
    print(beverage_with_milk_and_mocha.get_desc())
    print(beverage_with_milk_and_mocha.cost())