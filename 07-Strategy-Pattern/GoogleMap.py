from BikePathCalculatorStrategy import BikePathCalculatorStrategy
from CarPathCalculatorStrategy import CarPathCalculatorStrategy
from PathCalculatorStrategyFactory import PathCalculatorStrategyFactory
from TravelMode import TravelMode
from WalkPathCalculatorStrategy import WalkPathCalculatorStrategy


class GoogleMap:

    def find_path_version_3(travel_mode):
        strategy = PathCalculatorStrategyFactory.get_path_calculator_strategy_by_mode(travel_mode)
        if strategy:
            strategy.find_path()
        else:
            print("Invalid travel mode selected.")

    def find_path_version2(self, travel_mode: TravelMode):
        path_calculator_strategy = None

        if travel_mode == TravelMode.BIKE:
            path_calculator_strategy = BikePathCalculatorStrategy()
        elif travel_mode == TravelMode.CAR:
            path_calculator_strategy = CarPathCalculatorStrategy()
        elif travel_mode == TravelMode.WALK:
            path_calculator_strategy = WalkPathCalculatorStrategy()

        if path_calculator_strategy:
            path_calculator_strategy.find_path()

    def find_path_version1(self, travel_mode: TravelMode):
        if travel_mode == TravelMode.BIKE:
            # certain algorithm for bike
            print("Bike path is being calculated")
        elif travel_mode == TravelMode.CAR:
            # certain algorithm for car
            print("Car path is being calculated")
        elif travel_mode == TravelMode.WALK:
            # certain algorithm for walk
            print("Walk path is being calculated")




