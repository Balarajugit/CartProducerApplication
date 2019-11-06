package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CartProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartProducerApplication.class, args);
	}

}
