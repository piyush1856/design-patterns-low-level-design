from typing import List

from Observer import Observer
from Subject import Subject


# WeatherData class implementing Subject
class WeatherData(Subject):
    def __init__(self):
        self.observers: List[Observer] = []
        self.temperature: float = 0.0
        self.humidity: float = 0.0
        self.pressure: float = 0.0

    def register_observer(self, observer: Observer) -> None:
        self.observers.append(observer)
        print("Observer is registered")

    def remove_observer(self, observer: Observer) -> None:
        self.observers.remove(observer)
        print("Observer is removed")

    def notify_observers(self) -> None:
        for observer in self.observers:
            observer.update(self.temperature, self.humidity, self.pressure)

    def measurements_changed(self) -> None:
        print("Measurements changed")
        self.notify_observers()

    def set_measurements(self, temperature: float, humidity: float, pressure: float) -> None:
        self.temperature = temperature
        self.humidity = humidity
        self.pressure = pressure
        self.measurements_changed()

    def get_temperature(self) -> float:
        return self.temperature

    def get_humidity(self) -> float:
        return self.humidity

    def get_pressure(self) -> float:
        return self.pressure
