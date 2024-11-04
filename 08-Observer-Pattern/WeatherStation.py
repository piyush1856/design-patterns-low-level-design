from CurrentStatsDisplay import CurrentStatsDisplay
from ForecastStatsDisplay import ForecastStatsDisplay
from WeatherData import WeatherData

if __name__ == '__main__':
    # Create WeatherData instance
    weather_data = WeatherData()

    # Create CurrentStatsDisplay and ForecastStatsDisplay instances
    current_stats_display = CurrentStatsDisplay(weather_data)
    forecast_stats_display = ForecastStatsDisplay()

    # Register CurrentStatsDisplay with WeatherData
    weather_data.register_observer(current_stats_display)

    # Update weather measurements
    weather_data.set_measurements(10.0, 20.0, 30.0)
    weather_data.set_measurements(10.0, 21.0, 30.0)

    # Remove CurrentStatsDisplay and register ForecastStatsDisplay
    weather_data.remove_observer(current_stats_display)
    weather_data.register_observer(forecast_stats_display)

    # Update weather measurements again
    weather_data.set_measurements(10.0, 20.0, 30.0)