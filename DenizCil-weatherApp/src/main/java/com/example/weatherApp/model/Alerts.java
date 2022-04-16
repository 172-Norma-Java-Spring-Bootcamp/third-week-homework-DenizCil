package com.example.weatherApp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Alerts{

	@JsonProperty("alert")
	private List<Object> alert;
}