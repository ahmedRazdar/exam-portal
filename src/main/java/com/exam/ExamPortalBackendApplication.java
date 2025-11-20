package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamPortalBackendApplication {

    //main class
	public static void main(String[] args) {
		SpringApplication.run(ExamPortalBackendApplication.class, args);

        System.out.println("Application has been started");
	}
}
