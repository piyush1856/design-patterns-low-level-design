from BikePathCalculatorStrategy import BikePathCalculatorStrategy
from CarPathCalculatorStrategy import CarPathCalculatorStrategy
from TravelMode import TravelMode
from WalkPathCalculatorStrategy import WalkPathCalculatorStrategy


class PathCalculatorStrategyFactory:
    @staticmethod
    def get_path_calculator_strategy_by_mode(travel_mode):
        if travel_mode == TravelMode.BIKE:
            return BikePathCalculatorStrategy()
        elif travel_mode == TravelMode.CAR:
            return CarPathCalculatorStrategy()
        elif travel_mode == TravelMode.WALK:
            return WalkPathCalculatorStrategy()
        else:
            return None