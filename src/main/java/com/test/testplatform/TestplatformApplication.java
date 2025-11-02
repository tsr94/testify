package com.test.testplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestplatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestplatformApplication.class, args);
	}

}
