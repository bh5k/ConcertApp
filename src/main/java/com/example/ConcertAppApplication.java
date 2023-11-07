package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ConcertAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcertAppApplication.class, args);
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
