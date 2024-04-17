package com.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootTomcatRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTomcatRestApplication.class, args);
	}

	@RequestMapping("/")
	public void test() {
		System.out.println("Ejecutando spring-boot-tomcat-rest...");
	}
}
