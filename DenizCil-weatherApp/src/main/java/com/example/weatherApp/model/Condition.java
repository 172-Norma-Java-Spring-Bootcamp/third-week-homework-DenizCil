package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Condition{

	@JsonProperty("code")
	private int code;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("text")
	private String text;
}