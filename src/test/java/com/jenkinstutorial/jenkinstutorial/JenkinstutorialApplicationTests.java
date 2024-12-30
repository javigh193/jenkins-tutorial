package com.jenkinstutorial.jenkinstutorial;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinstutorialApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkinstutorialApplicationTest.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
