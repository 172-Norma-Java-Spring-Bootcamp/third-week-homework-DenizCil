package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CurrentWeatherApi{

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;
}