package com.firstMicroservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstMicroservice.limitsservice.bean.Limits;
import com.firstMicroservice.limitsservice.configauration.Configauration;

@RestController
public class LimitController {

	@Autowired
	private Configauration config;
	
	@GetMapping("/limits")
	public Limits limitService(){
		return new Limits(config.getMinimum(),config.getMaximum());
	}
}
