package com.example.weatherApp.controller;


import com.example.weatherApp.model.CurrentWeatherApi;
import com.example.weatherApp.model.ForecastWeatherApi;
import com.example.weatherApp.service.WeatherApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

@RestController
@RequestMapping(path = "api/v1.0")
public class WeatherController {

    @Autowired
    WeatherApiService weatherApiService;

    @GetMapping(path = "/current/weather/{cityname}")
    public CurrentWeatherApi getCurrentWeather(@PathVariable(name = "cityname") String cityName){
        return weatherApiService.getCurrentWeather(cityName);
    }

    @GetMapping(path = "/forecast/weather/{cityname}/{days}")
    public ForecastWeatherApi getCurrentWeather(@PathVariable(name = "cityname") String cityName,
                                                @PathVariable(name="days") @Min(0) int day) {
        if(day<0){
            throw new RuntimeException("The day cannot be less than zero (0).");
        }
        return weatherApiService.getForecastWeather(cityName,day);
    }
