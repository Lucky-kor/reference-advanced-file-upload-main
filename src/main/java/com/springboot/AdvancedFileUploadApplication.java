package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AdvancedFileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedFileUploadApplication.class, args);
	}

}
