package com.example.JenkinsImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
@RestController
public class JenkinsImplementationApplication {
	public static void main(String[] args) {
		SpringApplication.run(JenkinsImplementationApplication.class, args);
	}

	@GetMapping
	public String hello() {
		System.out.println("Welcome");
		return "hello";
	}

}
