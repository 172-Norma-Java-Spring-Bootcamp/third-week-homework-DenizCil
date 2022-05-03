package com.example.weatherApp.service;

import com.example.weatherApp.model.CurrentWeatherApi;
import com.example.weatherApp.model.ForecastWeatherApi;

public interface WeatherApiService {

    CurrentWeatherApi getCurrentWeather(String cityName);
    ForecastWeatherApi getForecastWeather(String cityName, int day);

}
