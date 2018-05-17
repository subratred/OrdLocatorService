package com.order.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.order")
public class OrdlocatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdlocatorApplication.class, args);
	}
}
