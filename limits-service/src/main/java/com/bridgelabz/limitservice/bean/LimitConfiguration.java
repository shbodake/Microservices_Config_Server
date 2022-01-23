package com.bridgelabz.limitservice.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class LimitConfiguration {

	
	private int maximum;
	private int minimum;
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	private LimitConfiguration() {
	}
	
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
}
