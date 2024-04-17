package com.spring.app.spring_boot_tomcat_rest_crud_layers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.app.spring_boot_tomcat_rest_crud_layers")
public class SpringBootTomcatRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTomcatRestApplication.class, args);
	}

}
