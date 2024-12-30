package com.jenkinstutorial.jenkinstutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinstutorialApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinstutorialApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(JenkinstutorialApplication.class, args);
	}

}
