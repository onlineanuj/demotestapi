package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestTestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTestApiApplication.class, args);
		System.out.println("Hi Test class");
	}

}
