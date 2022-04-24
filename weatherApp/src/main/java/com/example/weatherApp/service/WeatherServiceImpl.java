package com.example.weatherApp.service;

import com.example.weatherApp.model.CurrentWeatherApi;
import com.example.weatherApp.model.ForecastWeatherApi;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherServiceImpl implements WeatherApiService{

    RestTemplate restTemplate = new RestTemplate();


    @Override
    public CurrentWeatherApi getCurrentWeather(String cityName) {
        final String baseUrl = "http://api.weatherapi.com/v1/current.json?key=01f1e1f1870e4e9f8d7202447221404&q="+cityName+"&aqi=yes";
        return restTemplate.getForEntity(baseUrl, CurrentWeatherApi.class).getBody();

    }

    @Override
    public ForecastWeatherApi getForecastWeather(String cityName, int day) {
        final String baseUrl =
                "http://api.weatherapi.com/v1/forecast.json?key=01f1e1f1870e4e9f8d7202447221404&q="+cityName+"&days="+day+"&aqi=yes&alerts=yes";
        


        return restTemplate.getForEntity(baseUrl, ForecastWeatherApi.class).getBody();
    }
}
