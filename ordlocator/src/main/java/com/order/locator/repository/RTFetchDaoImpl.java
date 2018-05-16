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
		String query="select TOP 2 id,order_id,lattitude,longitude,lastupdatedon from ordlocation order by ID desc";
		Map<String,Object> data=new HashMap<>();
		List<Map<String, Object>> output=jdbcTemplate.queryForList(query);
		data.put("current", output.get(0));
		data.put("previous", output.get(1));
		return data;
	}
}
