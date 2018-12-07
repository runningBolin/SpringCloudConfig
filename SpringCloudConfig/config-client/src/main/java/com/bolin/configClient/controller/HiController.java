package com.bolin.configClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Value("${foo}")
	String foo;
	
	@RequestMapping("/hi")
	public String hi() {
		return foo;
	}
}
