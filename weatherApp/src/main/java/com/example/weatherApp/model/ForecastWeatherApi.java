package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastWeatherApi{

	@JsonProperty("alerts")
	private Alerts alerts;

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("forecast")
	private Forecast forecast;
}