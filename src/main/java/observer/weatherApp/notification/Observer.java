package observer.weatherApp.notification;

import observer.weatherApp.weather.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast forecast);
}
