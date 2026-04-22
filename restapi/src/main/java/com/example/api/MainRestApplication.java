package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class MainRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainRestApplication.class, args);
		System.out.println("Application Started Successfully");
	}
}