package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringWithJenkinsApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringWithJenkinsApplicationTests.class);

	@Test
	void contextLoads() {

		logger.info("in contextLoads() method");

		assertEquals(true, true);
	}

}
