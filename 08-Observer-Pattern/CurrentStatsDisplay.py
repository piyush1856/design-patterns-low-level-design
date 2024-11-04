from Observer import Observer


class CurrentStatsDisplay(Observer):
    def __init__(self, weather_data):
        self.weather_data = weather_data
        self.temperature: float = 0.0
        self.humidity: float = 0.0
        self.pressure: float = 0.0

    def update(self, temp: float, humidity: float, pressure: float) -> None:
        self.temperature = temp
        self.humidity = humidity
        self.pressure = pressure
        self.display()

    def update_from_weather_data(self) -> None:
        self.temperature = self.weather_data.get_temperature()
        self.humidity = self.weather_data.get_humidity()
        self.pressure = self.weather_data.get_pressure()

    def display(self) -> None:
        print("Current Conditions: ", end=' ')
        print(f"Temperature: {self.temperature}, Humidity: {self.humidity}, Pressure: {self.pressure}")

    def register_for_updates(self) -> None:
        self.weather_data.register_observer(self)