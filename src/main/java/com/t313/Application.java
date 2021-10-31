package com.t313;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.t313")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
