package com.rpozzi.kafkastreams.dto;

public class Sensor {
	private int temperature;
	private int humidity;

	public Sensor() {
		super();
	}

	public Sensor(int temperature, int humidity) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}