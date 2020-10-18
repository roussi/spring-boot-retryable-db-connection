package com.aroussi.retryabledbconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class RetryableDbConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetryableDbConnectionApplication.class, args);
	}

}
