package com.springweb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ResponseEntity inicio() {
		System.out.println("Llamando al controller222");

		return new ResponseEntity("dato", HttpStatus.OK);
	}
	
}
