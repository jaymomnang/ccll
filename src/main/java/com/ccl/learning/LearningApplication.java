package com.ccl.learning;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(LearningApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "7000"));
        app.run(args);
	}

}
