package com.jenkinstutorial.jenkinstutorial;

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
