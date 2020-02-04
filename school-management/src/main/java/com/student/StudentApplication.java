package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.student")
@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
}
