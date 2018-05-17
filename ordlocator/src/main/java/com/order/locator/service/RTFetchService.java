package com.order.locator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.locator.repository.RTFetchDaoImpl;

@Service
public class RTFetchService {

	@Autowired
	RTFetchDaoImpl rtFetchDaoImpl;
	
	public Object getLiveCoords(String orderId) throws Exception {
		if (orderId != null && !orderId.isEmpty()) {
			return rtFetchDaoImpl.getTest(orderId);
		} else {
			return rtFetchDaoImpl.getTest(orderId);
		}
	}
	
	public Object getOrderDetails(String orderId) throws Exception {
		if (orderId != null && !orderId.isEmpty()) {
			return rtFetchDaoImpl.getOrderDetails(orderId);
		} else {
			return rtFetchDaoImpl.getOrderDetails(orderId);
		}
	}
}
