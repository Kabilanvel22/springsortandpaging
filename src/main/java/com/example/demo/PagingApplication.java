package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class PagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagingApplication.class, args);
	}

}



