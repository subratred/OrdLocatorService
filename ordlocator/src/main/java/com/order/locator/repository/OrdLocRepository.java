package com.order.locator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.locator.domain.OrdLocation;

@Repository
public interface OrdLocRepository extends JpaRepository<OrdLocation, Long> {

	List<OrdLocation> findAllByOrderId(String orderId);

}
