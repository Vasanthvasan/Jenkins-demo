package com.Test.jenkins_Test;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {


	public static Logger log = LoggerFactory.getLogger(JenkinsTestApplication.class);


	@PostConstruct
	public void intt(){
		log.info("*********************started **************");
	}

	public static void main(String[] args) {
		log.info("********************* Running **************");

		System.out.println("********** Running ***************");
		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
