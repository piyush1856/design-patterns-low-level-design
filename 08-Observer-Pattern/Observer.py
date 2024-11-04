from abc import ABC, abstractmethod

class Observer(ABC):
    @abstractmethod
    def update(self, temp: float, humidity: float, pressure: float):
        pass

    @abstractmethod
    def update_from_weather_data(self):
        pass