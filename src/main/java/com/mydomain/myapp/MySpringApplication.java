package com.mydomain.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MySpringApplication {

	private final Logger log = LoggerFactory.getLogger(MySpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
	}

	@PostConstruct
	public void init() {
		log.info("Starting up");
	}


}

