package com.example.productapi.service_eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.productapi.service_eureka_client", "repository"})

public class ServiceEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurekaClientApplication.class, args);
	}

}
