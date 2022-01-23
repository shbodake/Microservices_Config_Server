package com.bridgelabz.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.limitservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private LimitConfiguration limitConfiguration;
	
	@GetMapping("/min_max_limits")
	public LimitConfiguration returnLimits() {
		return new LimitConfiguration(limitConfiguration.getMaximum(), limitConfiguration.getMinimum());
	}
}
