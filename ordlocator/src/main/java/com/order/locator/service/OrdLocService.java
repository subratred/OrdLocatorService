package com.order.locator.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.locator.domain.OrdLocation;
import com.order.locator.repository.OrdLocRepository;

@Service
public class OrdLocService {

	@Autowired
	OrdLocRepository ordLocRepository;

	public boolean saveLocationData(OrdLocation location) {
		try {
			location.setLastupdatedon(LocalDateTime.now());
			ordLocRepository.save(location);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<OrdLocation> getLocData(String orderId) {
		if (orderId != null && !orderId.isEmpty()) {
			return ordLocRepository.findAllByOrderId(orderId);
		} else {
			return ordLocRepository.findAll();
		}
	}
}
