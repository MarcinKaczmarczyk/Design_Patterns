package observer.weatherApp.notification;

import observer.weatherApp.weather.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast forecast) {
        System.out.println("Radio- temperatura: "+forecast.getTemperature()+" stopni, ciśnienie: "+forecast.getPressure());
    }
}
