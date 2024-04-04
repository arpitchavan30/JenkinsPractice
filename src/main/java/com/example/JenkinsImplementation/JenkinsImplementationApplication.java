package com.example.JenkinsImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class JenkinsImplementationApplication {

	public static void main(String[] args) {

		log.info("Working fine {}");
		System.out.println("Welcome to Jenkins !!!");
	}

}
