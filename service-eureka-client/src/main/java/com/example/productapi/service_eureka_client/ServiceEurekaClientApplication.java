package com.example.productapi.service_eureka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.productapi.service_eureka_client", "repository"})

public class ServiceEurekaClientApplication {

	public static void main(String[] args) {
		System.out.println("heelo");
		SpringApplication.run(ServiceEurekaClientApplication.class, args);
	}

}
