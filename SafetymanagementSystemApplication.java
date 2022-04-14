package com.sample.safetymanagement.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages ={"com.model","com.dao"})

@EntityScan("com.model");
@EnableJpaRepositories({"com.dao"})

@SpringBootApplication
public class SafetymanagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafetymanagementSystemApplication.class, args);
	}

}
