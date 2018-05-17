package com.order.locator.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RTFetchDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Object getTest(String orderId) throws Exception{
		String query="select TOP 2 id,order_id,lattitude,longitude,lastupdatedon from ordlocation where order_id="+orderId+"order by ID desc";
		Map<String,Object> data=new HashMap<>();
		List<Map<String, Object>> output=jdbcTemplate.queryForList(query);
		data.put("current", output.get(0));

		return data;
	}
	
	public Object getOrderDetails(String orderId) throws Exception{
		String query="select * from ordDetails where order_Id="+orderId;
		Map<String,Object> data=new HashMap<>();
		List<Map<String, Object>> output=jdbcTemplate.queryForList(query);
		data.put("productDetails", output.get(0));

		return data;
	}
}
