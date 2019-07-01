package com.learnit.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.learnit")
public class LearnitApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnitApplication.class, args);
	}

}
