package com.example.simboosta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.example")

@EnableJpaRepositories("com.example.simboosta.repository") 
@EntityScan("com.example.simboosta.entity")
public class SimboostaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimboostaApplication.class, args);
	}

}
