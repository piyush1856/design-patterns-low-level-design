from Observer import Observer


class ForecastStatsDisplay(Observer):
    def __init__(self):
        self.temperature: float = 0.0
        self.humidity: float = 0.0
        self.pressure: float = 0.0

    def update(self, temp: float, humidity: float, pressure: float) -> None:
        self.temperature = temp
        self.humidity = humidity
        self.pressure = pressure
        self.display()

    def update_from_weather_data(self) -> None:
        # This method can remain empty since it's not needed for this display
        pass

    def display(self) -> None:
        print("Current Conditions: ", end=' ')
        print(f"Temperature: {self.temperature}, Humidity: {self.humidity}, Pressure: {self.pressure}")
