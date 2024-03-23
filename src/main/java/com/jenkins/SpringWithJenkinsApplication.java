package com.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringWithJenkinsApplication {

	final static Logger logger = LoggerFactory.getLogger(SpringWithJenkinsApplication.class);
	

	@PostConstruct
	public void start_method()
	{
		System.out.println("This is jenkis application");
	}

	public static void main(String[] args) {
		
		logger.info("application started");
		
		logger.info("second log info added in the application");
		SpringApplication.run(SpringWithJenkinsApplication.class, args);
	}

}
