package com.springweb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@GetMapping("/saludo")
	public void saludar() {
		System.out.println("estoy saludando...");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
