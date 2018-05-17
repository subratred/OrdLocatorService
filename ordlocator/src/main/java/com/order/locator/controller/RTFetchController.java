package com.order.locator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.locator.domain.OrdLocation;
import com.order.locator.service.OrdLocService;
import com.order.locator.service.RTFetchService;

@RestController
public class RTFetchController {

	@Autowired
	RTFetchService rtFetchService;
	
	@RequestMapping("/getLiveCoords")
	public Object getLocData(@RequestParam("orderid") String orderId) throws Exception {
		//List<OrdLocation> response = null;
		//response = rtFetchService.getLiveCoords(orderId);
		return rtFetchService.getLiveCoords(orderId);
	}
	
	@RequestMapping("/getOrderDetails")
	public Object getOrderDetails(@RequestParam("orderid") String orderId) throws Exception {
		//List<OrdLocation> response = null;
		//response = rtFetchService.getLiveCoords(orderId);
		return rtFetchService.getOrderDetails(orderId);
	}
}
