package com.example.weatherApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location{

	@JsonProperty("localtime")
	private String localtime;

	@JsonProperty("country")
	private String country;

	@JsonProperty("localtime_epoch")
	private int localtimeEpoch;

	@JsonProperty("name")
	private String name;

	@JsonProperty("lon")
	private double lon;

	@JsonProperty("region")
	private String region;

	@JsonProperty("lat")
	private double lat;

	@JsonProperty("tz_id")
	private String tzId;
}