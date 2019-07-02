package com.learnit.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication()
@ComponentScan("com.learnit")
public class LearnitApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnitApplication.class, args);
	}

}
