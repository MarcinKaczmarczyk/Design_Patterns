package observer.weatherApp.notification;

import observer.weatherApp.weather.WeatherForecast;

public class TvNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast forecast) {
        System.out.println("Internet- temperatura: "+forecast.getTemperature()+" stopni, ciśnienie: "+forecast.getPressure());
    }
}
