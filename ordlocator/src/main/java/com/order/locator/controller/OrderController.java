package com.order.locator.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.locator.domain.OrdLocation;
import com.order.locator.domain.ServiceResponse;
import com.order.locator.service.OrdLocService;

@RestController
public class OrderController {
	
	@Autowired
	OrdLocService ordLocService;
	
	@RequestMapping("/testService")
	public Map<String, String> testService() {
		Map<String, String> result = new HashMap<>();
		result.put("status", "Success");
		result.put("message", "Hello, app is working!");
		return result;
	}
	
	@RequestMapping(value="/saveLocData", method=RequestMethod.POST)
	public ServiceResponse saveLocData(@RequestBody OrdLocation ordLoc) {
		System.out.println("Request: "+ordLoc);
		ServiceResponse response = new ServiceResponse("error", "Unable to save data !", null);
		if (ordLocService.saveLocationData(ordLoc)) {
			response.setStatus("success");
			response.setMessage("Data saved successfully !");
		}
		return response;
	}
	
	@RequestMapping("/getLocData")
	public List<OrdLocation> getLocData(@RequestParam("orderid") String orderId) {
		List<OrdLocation> response = null;
		response = ordLocService.getLocData(orderId);
		return response;
	}
}
