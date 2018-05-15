package com.order.locator.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	@RequestMapping("/testService")
	public Map<String, String> testService() {
		Map<String, String> result = new HashMap<>();
		result.put("status", "Success");
		result.put("message", "Hello, app is working!");
		return result;
	}
}
