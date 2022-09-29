package com.example.SpringFamily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFamilyApplication {

	public static void main(String[] args) {
		System.out.println("1");
		SpringApplication.run(SpringFamilyApplication.class, args);
		System.out.println("2");
	}

}
