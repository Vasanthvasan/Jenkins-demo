package com.Test.jenkins_Test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

@SpringBootTest
class JenkinsTestApplicationTests {

	public static Logger log = LoggerFactory.getLogger(JenkinsTestApplication.class);


	@Test
	void contextLoads() {
		log.info("********************* Testing **************");

		AssertionErrors.assertEquals("passed",true,true);
	}

}
