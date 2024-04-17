package com.springweb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableWebMvc
@ComponentScan(basePackages= {
  "com.springweb.app" }) 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
